package com.alex.pro.app;

import com.alex.pro.main.MainController;
import com.jfinal.config.*;
import com.jfinal.template.Engine;

public class AppConfig extends JFinalConfig {

    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);

    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/", MainController.class);
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
