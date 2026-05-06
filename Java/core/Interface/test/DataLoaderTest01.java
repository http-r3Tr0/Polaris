package Polaris.Java.core.Interface.test;

import Polaris.Java.core.Interface.dominio.DataLoader;
import Polaris.Java.core.Interface.dominio.DatabaseLoader;
import Polaris.Java.core.Interface.dominio.FileLoader;

import java.io.File;

public class DataLoaderTest01 {
    public static void main(String[] args){
        DatabaseLoader databaseloader = new DatabaseLoader();
        FileLoader fileloader = new FileLoader();
        fileloader.loader();
        databaseloader.loader();
        fileloader.remove();
        databaseloader.remove();
        fileloader.checkPermission();
        databaseloader.checkPermission();

        DataLoader.retriveMaxDataSize();
        DatabaseLoader.retriveMaxDataSize();
    }
}
