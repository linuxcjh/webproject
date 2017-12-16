package com.alex.pro.main;

import com.jfinal.core.Controller;

/**
 * Main Enter
 */
public class MainController extends Controller {

    public void index() {
        renderText("Hello Alex!");
    }
}
