package open_closed_principle;

/*
 * Hạn chế sửa đổi: Ta không nên chỉnh sửa source code của một module hoặc class có sẵn, vì sẽ ảnh hưởng tới tính đúng đắn của chương trình.
 * Ưu tiên mở rộng: Khi cần thêm tính năng mới, ta nên kế thừa và mở rộng các module/class có sẵn thành các module con lớn hơn.với yêu cầu.
 */

interface Strategy {
    public void doSomething();
}

class Context {
    private Strategy strategy;
    // we set the strategy in the constructor
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeTheStrategy() {
        this.strategy.doSomething();
    }
}

class Strategy1 implements Strategy {
    public void doSomething() {
        System.out.println("Execute strategy 1");
    } 
}

class Strategy2 implements Strategy {
    public void doSomething() {
        System.out.println("Execute strategy 2");
    } 
}


public class OpenClosed {
	public static void main(String[] args) {
        Context context = new Context(new Strategy1()); // we inject the Strategy1
        context.executeTheStrategy();  // it will print “Execute strategy 1”;

        context = new Context(new Strategy2());  // we inject the Strategy2
        context.executeTheStrategy();  // it will print “Execute strategy 2”
    }
	
}