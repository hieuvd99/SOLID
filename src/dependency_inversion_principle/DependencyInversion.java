package dependency_inversion_principle;

/*
 * 1. Các module cấp cao không nên phụ thuộc vào các modules cấp thấp. Cả 2 nên phụ thuộc vào abstraction.
 * 2. Interface (abstraction) không nên phụ thuộc vào chi tiết, mà ngược lại. ( Các class giao tiếp với nhau thông qua interface, không phải thông qua implementation.)
 */

interface IDatabase {
    void Save(int orderId);
}
interface ILogger {
    void LogInfo(String info);
}
 interface IEmailSender {
    void SendEmail(int userId);
}
 
// Các Module implement các Interface
class Logger implements ILogger {
    public void LogInfo(String info) {}
}
class Database implements IDatabase {
    public void Save(int orderId) {}
}
class EmailSender implements IEmailSender {
    public void SendEmail(int userId) {
    	System.out.println("A");
    }
}

public class DependencyInversion {
	// Hàm checkout mới sẽ như sau
	public static void main(String[] args) {
		int orderId = 0, userId = 0;
		// Nếu muốn thay đổi database, logger ta chỉ cần thay dòng code dưới
	    // Các Module XMLDatabase, SQLDatabase phải implement IDatabase
	    //IDatabase db = new XMLDatabase(); 
	    //IDatebase db = new SQLDatabase();
	    IDatabase db = new Database();
	    db.Save(orderId);
	 
	    ILogger log = new Logger();
	    log.LogInfo("Order has been checkout");
	 
	    IEmailSender es = new EmailSender();
	    es.SendEmail(userId);
	}
	
}
