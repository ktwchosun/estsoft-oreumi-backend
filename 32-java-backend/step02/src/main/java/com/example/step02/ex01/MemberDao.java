package com.example.step02.ex01;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
    // H2 데이터베이스의 접속 정보를 나타내는 정적 상수
    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:~/test";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";

    // 데이터베이스 연동과 관련된 객체들
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public List<MemberVo> getMemberList() {
        List<MemberVo> memberVoList = new ArrayList<>();

        try {

            connectDatabase();

            String query = "SELECT * FROM MEMBERS";
            System.out.println("Query: " + query);

            // SQL 문을 실행
            resultSet = statement.executeQuery(query);

            // 반복자로 ResultSet 인스턴스에 저장된 레코드를 차례대로 확인
            while (resultSet.next()) {
                // ResultSet 인스턴스의 커서가 가리키는 레코드의 컬럼을 참조
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                Date createdAt = resultSet.getDate("created_at");

                // MemberVo 인스턴스 생성
                MemberVo memberVo = new MemberVo(id, username, password, name, email, createdAt);

//              // ArrayList 인스턴스에 MemberVo 인스턴스를 추가
                memberVoList.add(memberVo);
            }

        }  catch (Exception e) {
            throw new RuntimeException(e);
        }   finally {
            if (resultSet != null) try { resultSet.close(); } catch (SQLException ignore) { }
            if (statement != null) try { statement.close(); } catch (SQLException ignore) { }
            if (connection != null) try { connection.close(); } catch (SQLException ignore) { }

            System.out.println("SUCCESS: Close the Statement and Connection.");
        }

        return memberVoList;
    }
    private void connectDatabase() throws ClassNotFoundException, SQLException {
        Class.forName(DB_DRIVER);
        System.out.println("SUCCESS: Load the JDBC driver");

        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        System.out.println("SUCCESS: Connect to the database successfully");

        statement = connection.createStatement();
        System.out.println("SUCCESS: Create the database successfully");
    }
}
