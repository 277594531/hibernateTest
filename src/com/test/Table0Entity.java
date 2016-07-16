package com.test;

import javax.persistence.*;

/**
 * Created by yexianshan on 2016/7/16.
 */
@Entity
@Table(name = "table0", schema = "", catalog = "test0")
public class Table0Entity {
    private int idtable0;
    private String table0Col;
    private String table0Col1;

    @Id
    @Column(name = "idtable0")
    public int getIdtable0() {
        return idtable0;
    }

    public void setIdtable0(int idtable0) {
        this.idtable0 = idtable0;
    }

    @Basic
    @Column(name = "table0col")
    public String getTable0Col() {
        return table0Col;
    }

    public void setTable0Col(String table0Col) {
        this.table0Col = table0Col;
    }

    @Basic
    @Column(name = "table0col1")
    public String getTable0Col1() {
        return table0Col1;
    }

    public void setTable0Col1(String table0Col1) {
        this.table0Col1 = table0Col1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table0Entity that = (Table0Entity) o;

        if (idtable0 != that.idtable0) return false;
        if (table0Col != null ? !table0Col.equals(that.table0Col) : that.table0Col != null) return false;
        if (table0Col1 != null ? !table0Col1.equals(that.table0Col1) : that.table0Col1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtable0;
        result = 31 * result + (table0Col != null ? table0Col.hashCode() : 0);
        result = 31 * result + (table0Col1 != null ? table0Col1.hashCode() : 0);
        return result;
    }
}
