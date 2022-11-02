/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool;

import java.sql.Connection;
import java.util.Stack;

/**
 *
 * @author User
 */
public class PoolConnection {
    private SQLAccess sql = new SQLAccess();
    private Stack stack = new Stack();
    private Connection con;
    
    public Connection getConnection(){
        if(!stack.empty()){
            return (Connection) stack.pop();
        }
        else{
            return sql.openConnection();
        }
    }
    
    public void returnConnection(Connection con){
        stack.push(con);
    }
    
    public void removeAll(){
        stack.clear();
    }
}
