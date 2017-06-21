package com.valentsiukevich.csv_project;

import com.valentsiukevich.csv_project.controllers.Controller;
import com.valentsiukevich.csv_project.utils.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties(args);
        Controller controller = new Controller();
        controller.start(properties);
    }
}
