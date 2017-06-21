package com.valentsiukevich.csv_project.readers.interfaces;

import com.valentsiukevich.csv_project.models.Table;

/**
 * @author ilya_valentsiukevich
 * @version 1.0.0
 */
public interface ITableReader {
    Table read(String fileName);
}
