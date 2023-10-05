public class RPN {
  private Model model;
  private CustomStack stack;
  private double leftValue;
  private double rightValue;


  public RPN(Model model) {
    this.model = model;
    stack = new CustomStack();
    leftValue = 0;
    rightValue = 0;
  }

  public String expressionToRPN(String expression) {
    String current = "";
    String[] array = expression.split(" ");
    int priority;

    for(String element : array) {
      priority = getPriority(element);

      if(priority > 0) {
        while(!stack.empty()) {
          if(getPriority(stack.peek()) >= priority){
            current = current + stack.pop() + " ";
          } else {
            break;
          }
        }
        stack.push(element);
      } else {
        current = current + element + " ";
      }
    }

    while (!stack.empty()) {
		    current = current + stack.pop() + " ";
	  }
    return calculateExpression(current);
  }

  public String calculateExpression(String expression) {
    CustomStack operands = stack;
	  String[] values = expression.split(" ");

  	for (String value : values) {
  	   switch(value) {
  		case "+":
          rightValue = Double.parseDouble(operands.pop());
          leftValue = Double.parseDouble(operands.pop());
          rightValue = leftValue + rightValue;
          operands.push(rightValue + "");
          leftValue = rightValue = 0;
          break;
  		case "-":
          rightValue = Double.parseDouble(operands.pop());
          leftValue = Double.parseDouble(operands.pop());
          rightValue = leftValue - rightValue;
          operands.push(rightValue + "");
          leftValue = rightValue = 0;
          break;
  		case "/":
          rightValue = Double.parseDouble(operands.pop());
          leftValue = Double.parseDouble(operands.pop());
          rightValue = leftValue / rightValue;
          operands.push(rightValue + "");
          leftValue = rightValue = 0;
          break;
  		case "*":
          rightValue = Double.parseDouble(operands.pop());
          leftValue = Double.parseDouble(operands.pop());
          rightValue = leftValue * rightValue;
          operands.push(rightValue + "");
          leftValue = rightValue = 0;
          break;
  		case "%":
          leftValue = Double.parseDouble(operands.pop());
          leftValue = leftValue / 100.;
          operands.push(leftValue + "");
          leftValue = 0;
          break;
      case "oneOver":
          leftValue = Double.parseDouble(operands.pop());
          leftValue = 1. / leftValue;
          operands.push(leftValue + "");
          leftValue = 0;
          break;
  		case "sqrt":
          leftValue = Double.parseDouble(operands.pop());
          leftValue = Math.sqrt(leftValue);
          operands.push(leftValue + "");
          leftValue = 0;
          break;
      case "power":
          leftValue = Double.parseDouble(operands.pop());
          leftValue = leftValue * leftValue;
          operands.push(leftValue + "");
          leftValue = 0;
          break;
      case "changeSign":
          leftValue = Double.parseDouble(operands.pop());
          leftValue = leftValue * -1;
          operands.push(leftValue + "");
          leftValue = 0;
          break;
  		default:
  		    operands.push(value);
  		    break;
  	    }
   	  }
    return operands.pop();
  }


  private int getPriority(String sign) {
    if(sign.equals("sqrt") || sign.equals("power") ||
       sign.equals("oneOver") || sign.equals("%")){
      return 1;
    } else if(sign.equals("-") || sign.equals("+")) {
      return 2;
    } else if(sign.equals("/") || sign.equals("*")) {
      return 3;
    }
    return 0;
  }
}
