package com.wbg.springxmlbean.service.impl;

import com.wbg.springxmlbean.entity.Role;
import com.wbg.springxmlbean.service.RoleDataSourceService;
import com.wbg.springxmlbean.spring.ConfigDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class RoleDataSourceServiceImpl implements RoleDataSourceService {

    @Autowired
    ConfigDataSource dataSource=null;

    @Override
    public Role getRole(int id) {
        Connection con=null;
        ResultSet rs=null;
        PreparedStatement ps=null;
        Role role=null;
        try {
            con=dataSource.getDataSource().getConnection();
            ps=con.prepareStatement("select * from role where id = ?");
            ps.setInt(1,id);
            rs=ps.executeQuery();
            while (rs.next()){
                role=new Role();
                role.setId(rs.getInt(1));
                role.setRoleName(rs.getString(2));
                role.setNote(rs.getString(3));
            }
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return role;
    }

}
