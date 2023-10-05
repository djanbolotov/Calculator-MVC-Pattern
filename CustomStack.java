import java.util.Objects;

public class CustomStack {
    private CustomStackElement top = null;

    public void push(String symbol) {
      CustomStackElement pv = new CustomStackElement();
      pv.setItem(symbol);
      pv.setNext(top);
      top = pv;
    }

    public String pop() {
      CustomStackElement pv = top;
      top = top.getNext();
      return pv.getItem();
    }

    public String peek() {
      return top.getItem();
    }

    public boolean empty() {
      return Objects.isNull(top);
    }

    private class CustomStackElement {
      private String item;
      private CustomStackElement next;

      public String getItem() {
        return item;
      }

      public void setItem(String item) {
        this.item = item;
      }

      public CustomStackElement getNext() {
        return next;
      }

      public void setNext(CustomStackElement next) {
        this.next = next;
      }
    }
}
