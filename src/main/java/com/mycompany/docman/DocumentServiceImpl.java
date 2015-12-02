package com.mycompany.docman;

import java.sql.*;
import java.util.List;

public class DocumentServiceImpl extends ConnectionReturn implements DocumentService {

    public DocumentServiceImpl() {

    }

    @Override
    public List findAll() {
        Connection con = getConnection();
        String query = "SELECT * FROM users";

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

    }

    @Override
    public List search(String keyword) {

    }

}
