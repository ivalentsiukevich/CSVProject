package com.valentsiukevich.csv_project.controllers;

import com.valentsiukevich.csv_project.controllers.interfaces.IController;
import com.valentsiukevich.csv_project.models.Table;
import com.valentsiukevich.csv_project.readers.TableReader;
import com.valentsiukevich.csv_project.utils.Properties;
import com.valentsiukevich.csv_project.writers.TableWriter;

/**
 * @author ilya_valentsiukevich
 * @version 1.0.0
 */
public class Controller implements IController {
    private void start(String fileName, String value, String resultFileName) {
        TableReader tableReader = new TableReader();
        Table table = tableReader.read(fileName);
        TableWriter tableWriter = new TableWriter();
        tableWriter.write(table.getRowsAllMatchingElements(value), resultFileName);
    }

    @Override
    public void start(Properties properties) {
        if (properties.getValue("-i") != null && properties.getValue("-q") != null && properties.getValue("-o") != null) {
            start(properties.getValue("-i"), properties.getValue("-q"), properties.getValue("-o"));
        } else {
            System.out.println("Invalid input parameters!");
        }
    }
}
