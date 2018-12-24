package com.sargeraswang.util.ExcelUtil;

import java.lang.reflect.Field;

/**
 * The <code>FieldForSortting</code>
 * 
 * @author sargeras.wang
 * @version 1.0, Created at 2013年9月17日
 */
public class FieldForSortting {
    private Field field;
    private int index;
    private String fmt;
    private String writeReplace;
    private String readReplace;
    /**
     * @param field
     */
    public FieldForSortting(Field field) {
        super();
        this.field = field;
    }

    /**
     * @param field
     * @param index
     */
    public FieldForSortting(Field field, int index) {
        super();
        this.field = field;
        this.index = index;
    }

    public FieldForSortting(Field field, int index, String fmt, String writeReplace, String readReplace) {
        this.field = field;
        this.index = index;
        this.fmt = fmt;
        this.writeReplace = writeReplace;
        this.readReplace = readReplace;
    }

    /**
     * @return the field
     */
    public Field getField() {
        return field;
    }

    /**
     * @param field
     *            the field to set
     */
    public void setField(Field field) {
        this.field = field;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index
     *            the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    public String getFmt() {
        return fmt;
    }

    public void setFmt(String fmt) {
        this.fmt = fmt;
    }

    public String getWriteReplace() {
        return writeReplace;
    }

    public void setWriteReplace(String writeReplace) {
        this.writeReplace = writeReplace;
    }

    public String getReadReplace() {
        return readReplace;
    }

    public void setReadReplace(String readReplace) {
        this.readReplace = readReplace;
    }
}
