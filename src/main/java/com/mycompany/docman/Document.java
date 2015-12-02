/*Выборки Нужны будут
- по типу договора
- по коду компании
- по названию компании
- по номеру договора
- по предмету договора
- по ответственному лицу*/
 
package com.mycompany.docman;

public class Document {
    private String docid; /*code of the document*/
    private String doctype; /*type of the document*/
    private String contragnt; /*contragent*/
    private String contragntid; /*code of the contragent*/
    private String docdate; /*date of entering into the contract*/
    private String expdate; /*expire date of the contract*/
    private String initial; /*name of the initiator*/
    private String docsubj; /*subject of the contract*/
    private String comment; /*commets*/

    public Document(String docid, String doctype, String contragnt, String contragntid, String docdate, String expdate, String initial, String docsubj, String comment) {
        this.docid = docid;
        this.doctype = doctype;
        this.contragnt = contragnt;
        this.contragntid = contragntid;
        this.docdate = docdate;
        this.expdate = expdate;
        this.initial = initial;
        this.docsubj = docsubj;
        this.comment = comment;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    public String getContragnt() {
        return contragnt;
    }

    public void setContragnt(String contragnt) {
        this.contragnt = contragnt;
    }

    public String getContragntid() {
        return contragntid;
    }

    public void setContragntid(String contragntid) {
        this.contragntid = contragntid;
    }

    public String getDocdate() {
        return docdate;
    }

    public void setDocdate(String docdate) {
        this.docdate = docdate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getDocsubj() {
        return docsubj;
    }

    public void setDocsubj(String docsubj) {
        this.docsubj = docsubj;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    @Override
        public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + ((docid == null) ? 0 : docid.hashCode());
                return result;
        }

        @Override
        public boolean equals(Object obj) {
                if (this == obj)
                        return true;
                if (obj == null)
                        return false;
                if (!(obj instanceof Document))
                        return false;
                Document other = (Document) obj;
                if (docid == null) {
                        if (other.docid != null)
                                return false;
                } else if (!docid.equals(other.docid))
                        return false;
                return true;
        }
    
    
    
    
    
}
