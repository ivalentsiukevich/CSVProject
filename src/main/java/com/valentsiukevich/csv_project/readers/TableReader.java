package com.valentsiukevich.csv_project.readers;

import com.valentsiukevich.csv_project.models.Table;
import com.valentsiukevich.csv_project.readers.interfaces.ITableReader;
import com.valentsiukevich.csv_project.utils.StringUtil;

/**
 * @author ilya_valentsiukevich
 * @version 1.0.0
 */
public class TableReader implements ITableReader{
    @Override
    public Table read(String fileName) {
        String fileExtension = StringUtil.getFileExtension(fileName);
        switch (fileExtension){
            case "csv":{
                CSVTableReader csvTableReader = new CSVTableReader();
                return csvTableReader.read(fileName);
            }
        }
        return null;
    }
}
