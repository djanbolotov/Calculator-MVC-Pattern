public class Model {
  private Viewer viewer;
  private String temp;
  private String result;
  private RPN rpn;

  public Model(Viewer viewer) {
    this.viewer = viewer;
    result = "";
    temp = "";
    rpn = new RPN(this);
  }

  public void doAction(String command) {

    switch(command) {
      case "One":
          temp = temp + 1;
          break;
      case "Two":
          temp = temp + 2;
          break;
      case "Three":
          temp = temp + 3;
          break;
      case "Four":
          temp = temp + 4;
          break;
      case "Five":
          temp = temp + 5;
          break;
      case "Six":
          temp = temp + 6;
          break;
      case "Seven":
          temp = temp + 7;
          break;
      case "Eight":
          temp = temp + 8;
          break;
      case "Nine":
          temp = temp + 9;
          break;
      case "Zero":
          temp = temp + 0;
          break;
      case "Plus_Command":
          if(temp.equals("")){
            return;
          }
          result = result + temp + " + ";
          temp = "";
          return;
       case "Minus_Command":
           if(temp.equals("")){
             return;
           }
           result = result + temp + " - ";
           temp = "";
           return;
        case "Multiply_Command":
            if(temp.equals("")){
              return;
            }
            result = result + temp + " * ";
            temp = "";
            return;
        case "Divide_Command":
            if(temp.equals("")){
              return;
            }
            result = result + temp + " / ";
            temp = "";
            return;
        case "ChangeSign_Command":
            temp = rpn.expressionToRPN(temp + " changeSign");
            temp = beautifyNumber(temp);
            break;
        case "Dot":
            if(temp.equals("")){
              return;
            }
            if(excistsChar('.', temp) == -1) {
              temp = temp + ".";
            }
            break;
        case "Delete_Command":
            if(temp.equals("")){
              return;
            }
            temp = deleteChar(temp);
            break;
        case "Clear_Command":
            result = "";
            temp = "";
            break;
        case "CE_Command":
            temp = "";
            break;
        case "Percent_Command":
            temp = rpn.expressionToRPN(temp + " %");
            temp = beautifyNumber(temp);
            break;
        case "OneOver_Command":
            temp = rpn.expressionToRPN(temp + " oneOver");
            break;
        case "SquareRoot_Command":
            temp = rpn.expressionToRPN(temp + " sqrt");
            temp = beautifyNumber(temp);
            break;
        case "Power_Command":
            temp = rpn.expressionToRPN(temp + " power");
            temp = beautifyNumber(temp);
            break;
        case "Equals_Command":
            result = result + temp;
            temp = rpn.expressionToRPN(result);
            temp = beautifyNumber(temp);
            result = "";
            break;
    }
    viewer.updateLabel(result + temp);
    if(temp.equals("")){
      viewer.update("0");
    } else {
      viewer.update(temp);
    }
  }

  private int excistsChar(char element, String word) {
    return word.indexOf(element);
  }

  private String deleteChar(String word) {
    return word.substring(0, word.length() - 1);
  }

  private String beautifyNumber(String number) {
    boolean check = number.substring(number.length() - 2, number.length()).equals(".0");
    if(check) {
      number = number.substring(0, number.length() - 2);
    }
    return number;
  }
}
