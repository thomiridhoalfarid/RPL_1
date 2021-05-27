/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import static Database.Conn.getConnection;
import Model.Membership;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class MembershipConn {
    public Membership getMembershipById(String id) throws SQLException {
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("select * from membership where membership_id =?");
        st.setString(1, id);
        ResultSet rs = st.executeQuery();
        Membership membership = new Membership();
        while  (rs.next()){
            membership.setValidation_status(rs.getString("validation_status"));
            membership.setStart_date(rs.getDate("start_date"));
            membership.setPayment_proof(rs.getString("payment_proof"));
            membership.setExpired_date(rs.getDate("expired_date"));
        }
        return membership;
    }
    public Membership getMembershipByUserId(String id) throws SQLException {
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("select * from membership where user_id =?");
        st.setString(1, id);
        ResultSet rs = st.executeQuery();
        Membership membership = new Membership();
        while  (rs.next()){
            membership.setValidation_status(rs.getString("validation_status"));
            membership.setStart_date(rs.getDate("start_date"));
            membership.setPayment_proof(rs.getString("payment_proof"));
            membership.setExpired_date(rs.getDate("expired_date"));
        }
        return membership;
    }
    public Membership getMembershipBySubsId(String id) throws SQLException {
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("select * from membership where subs_id =?");
        st.setString(1, id);
        ResultSet rs = st.executeQuery();
        Membership membership = new Membership();
        while  (rs.next()){
            membership.setValidation_status(rs.getString("validation_status"));
            membership.setStart_date(rs.getDate("start_date"));
            membership.setPayment_proof(rs.getString("payment_proof"));
            membership.setExpired_date(rs.getDate("expired_date"));
        }
        return membership;
    }
    
    public static void postMembership(Membership m, String sid, String uid) throws SQLException {
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("insert into membership (validation_status, start_date, payment_proof, expired_date, subs_id, user_id)"+" values(?,?,?,?,?,?)");
        st.setString(1, m.getValidation_status());
        st.setDate(2, m.getStart_date());
        st.setString(3, m.getPayment_proof());
        st.setDate(4, m.getExpired_date());
        st.setString(5, sid);        
        st.setString(6, uid);

        st.execute();
    }
}