package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Мой первый сервлет
 */
public class MyServlet extends HttpServlet {
    /**
     * @param request  параметры от пользователя
     * @param response наш ответ
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * @param request  параметры от пользователя
     * @param response наш ответ
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        String as = request.getParameter("a");
        if (as == null) {
            writer.println("Задайте параметр a");
            return;
        }
        double a;
        try {
            a = Double.parseDouble(as);
        } catch (NumberFormatException e) {
            writer.println("a должно быть числом");
            return;
        }
        String bs = request.getParameter("b");
        if (bs == null) {
            writer.println("Задайте параметр b");
            return;
        }
        double b;
        try {
            b = Double.parseDouble(bs);
        } catch (NumberFormatException e) {
            writer.println("b должно быть числом");
            return;
        }
        double sum = a + b;
        writer.println("Сумма = " + sum);
    }
}
