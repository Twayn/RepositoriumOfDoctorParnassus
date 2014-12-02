/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tomcatweb;

import javax.servlet.http.HttpServlet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Андрей
 */

public class DateTime extends HttpServlet{
    public static String getTime() {
        Date d1 = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY HH:mm a");
        String formattedDate = df.format(d1);

        return formattedDate;
    }


}
