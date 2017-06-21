package com.valentsiukevich.csv_project.writers.interfaces;

import com.valentsiukevich.csv_project.models.Row;
import com.valentsiukevich.csv_project.models.Table;

import java.util.ArrayList;

/**
 * @author ilya_valentsiukevich
 * @version 1.0.0
 */
public interface ITableWriter {
    void write(ArrayList<Row> rows, String fileName);
}
