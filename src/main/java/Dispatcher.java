import controller.BankController;
import lombok.AllArgsConstructor;

/**
 *  책임  : routing
 */
@AllArgsConstructor
public class Dispatcher {

    private BankController con;

    //  uri를 받아 라우팅 (메서드 호출)
    public void route(String url) {

        //  라우터, 디스패쳐
        if (url.equals("insert")) {
            con.insert();
        } else if (url.equals("delete")) {
            con.delete();
        } else if (url.equals("update")) {
            con.update();
        } else if (url.equals("selectOne")) {
            con.selectOne();
        } else if (url.equals("selectAll")) {
            con.selectAll();
        }
    }
}
