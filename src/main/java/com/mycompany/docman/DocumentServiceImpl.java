package com.mycompany.docman;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class DocumentServiceImpl extends ConnectionReturn implements DocumentService {

    public DocumentServiceImpl() {

    }

    @Override
    public List<Document> findAll() {
        Connection con = getConnection();
        String query = "SELECT * FROM test";
        List<Document> data = new ArrayList<>();
        try {
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                data.add(new Document(rs.getInt("Doc ID")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    @Override
    public List search(String keyword) {
        return null;
    }

}
