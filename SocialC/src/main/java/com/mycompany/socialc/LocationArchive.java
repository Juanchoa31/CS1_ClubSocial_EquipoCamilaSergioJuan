package com.mycompany.socialc;

public class LocationArchive {
    private String fileName;
    private String path;

    public LocationArchive() { 
        fileName = "archive6";
        path = "archives/" + fileName + ".csv";//Se crea método para instanciarse en otras clase, 
        //este sirve para darle una ruta y un nombre al archivo csv para almacenar las facturas
    }
    
    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    } 
}
