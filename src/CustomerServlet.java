import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getCustomers(request, response);

    }

    private void getCustomers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer.add(new Customer("Trần Văn Tú", LocalDate.parse("1999-09-02"), "Đà Nẵng","1.jpg"));
        listCustomer.add(new Customer("Lê Văn Thức", LocalDate.parse("2015-02-14"), "Đà Nẵng","2.jpg"));
        listCustomer.add(new Customer("Trần Quang Văn", LocalDate.parse("2014-01-10"), "Đà Nẵng","3.jpg"));
        listCustomer.add(new Customer("Mai Tấn Sang", LocalDate.parse("2009-12-14"), "Đà Nẵng","4.jpg"));
        request.setAttribute("listKH", listCustomer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getCustomers(request, response);
    }
}
