/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import context.DBContext;
import entity.account;
import entity.cart;
import entity.category;
import entity.checkOut;
import entity.product;
import entity.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nam
 */
public class DAO {
    Connection con;
    String status="";
    private void initConnection(){
        try{
            con=new DBContext().getConnection();
            status="Thanh cong";
        }catch(Exception e){
            status="That bai";
        }
    }
    public DAO(){
        initConnection();
    }
    
    private HashMap<Integer, product> hmProduct;
    private HashMap<Integer, category> hmCategory;
    private List<String> list;
    private List<Integer> list2;
    private List<product> list3;
    private List<cart> list4;
    private List<account> listAccount;
    private List<user> listUser;

    public HashMap<Integer, product> getHmProduct() {
        return hmProduct;
    }

    public void setHmProduct(HashMap<Integer, product> hmProduct) {
        this.hmProduct = hmProduct;
    }
    
    public HashMap<Integer, product> getProductList(String sql){
        hmProduct=new HashMap<Integer, product>();
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                product pr=new product(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getBigDecimal(4), 
                        rs.getInt(5), 
                        rs.getInt(6), 
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getBoolean(10),
                        rs.getInt(11)
                );
                hmProduct.put(rs.getInt(1), pr);
            }
        }catch(Exception e){
            
        }
        return hmProduct;
    }
    
    public HashMap<Integer, category> getCategory(String sql){
        hmCategory=new HashMap<Integer, category>();
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                category ct=new category(rs.getInt(1), rs.getString(2));
                hmCategory.put(rs.getInt(1), ct);
            }
        }catch(Exception e){
            
        }
        return hmCategory;
    }
    
    public List<String> getListString(String sql){
        list=new ArrayList<String>();
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                list.add(rs.getString(1));
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public List<Integer> getListInt(String sql){
        list2=new ArrayList<Integer>();
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                list2.add(rs.getInt(1));
            }
        }catch(Exception e){
            
        }
        return list2;
    }
    
    public product getProductDetail(String sql){
        product pr = null;
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                pr=new product(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getBigDecimal(4), 
                        rs.getInt(5), 
                        rs.getInt(6), 
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getBoolean(10),
                        rs.getInt(11)
                );
            }
        }catch(Exception e){
            
        }
        return pr;
    }
    
    public account login(String user, String pass){
        String sql="Select * from HE141488_account where account like ? and pass like ?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                return new account(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getBoolean(4));            
            }
        }catch(Exception e){
            
        }
        return null;
    }
    
    public account checkAccount(String user){
        String sql="Select * from HE141488_account where account like ?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, user);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                return new account(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getBoolean(4));            
            }
        }catch(Exception e){
            
        }
        return null;
    }
    
    public void signUpAccount(String user, String pass){
        String sql="INSERT INTO HE141488_account values (?,?,0)";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
    }
    public void signUpUser(String fisrtName, String lastName, String email,String address,String phone){
        String s ="SELECT COUNT(id) from HE141488_account";
        String accountId = null;
        try{
            PreparedStatement ps= con.prepareCall(s);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                  accountId=rs.getString(1);
            }
        }catch(Exception e){
            
        }
        String sql="INSERT INTO HE141488_user values ("+accountId+",?,?,?,?,?)";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, fisrtName);
            ps.setString(2, lastName);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
    }
    
    public user loginUser(String id){
        String sql="Select * from HE141488_user where accountId like ?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                return new user(rs.getInt(1), rs.getInt(2), 
                        rs.getString(3), rs.getString(4), 
                        rs.getString(5), rs.getString(6), 
                        rs.getString(7));
            }
        }catch(Exception e){
            
        }
        return null;
    }
    
    public int getNumberPage(String sql){
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int total=rs.getInt(1);
                int page=0;
                if(total%6!=0){
                    page=total/6+1;
                }else{
                    page=total/6;
                }
                return page;
            }
        }catch(Exception e){
            
        }
        return 0;
    }
    
    public void deleteProduct(String id){
        String sql2="Delete from HE141488_Cart where productId = ?";
        String sql = "Delete from HE141488_product where id = ?";
        try{
            PreparedStatement ps= con.prepareCall(sql2);
            ps.setString(1, id);
            ps.executeUpdate();
            ps= con.prepareCall(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
    }
    
    public void deleteAccount(String id){
        String sql2="Delete from HE141488_user where accountId = ?";
        String sql = "Delete from HE141488_account where id = ?";
        try{
            PreparedStatement ps= con.prepareCall(sql2);
            ps.setString(1, id);
            ps.executeUpdate();
            ps= con.prepareCall(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
    }
    
    public void insertProduct(String name,String image,String price,
            String title,String description,String size, String color,
            String gender, String amount, String cate){
        String sql="INSERT INTO HE141488_product values (?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, size);
            ps.setString(5, amount);
            ps.setString(6, description);
            ps.setString(7, title);
            ps.setString(8, color);
            ps.setString(9, gender);
            ps.setString(10, cate);            
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void updateProduct(String name,String image,String price,
            String title,String description,String size, String color,
            String gender, String amount, String cate, String id){
        String sql="Update HE141488_product set [name] = ? , [image] = ? , [price] = ? ,"
                + "[size] = ? , [amount] = ? , [description] = ? , [title] = ? ,"
                + "[color] = ? , [gender] = ? , [catID] = ? Where id = ?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, size);
            ps.setString(5, amount);
            ps.setString(6, description);
            ps.setString(7, title);
            ps.setString(8, color);
            ps.setString(9, gender);
            ps.setString(10, cate);
            ps.setString(11, id);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<product> loadCart(String id){
        list3 = new ArrayList<product>();
        String sql="Select pr.id,pr.name, pr.image, pr.price, pr.size, ct.amount , pr.description , pr.title , pr.color , pr.gender , pr.catID \n" +
"from HE141488_Cart ct, HE141488_product pr \n" +
"where ct.accountId = ? AND ct.productId=pr.id";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                product pr=new product(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getBigDecimal(4), 
                        rs.getInt(5), 
                        rs.getInt(6), 
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getBoolean(10),
                        rs.getInt(11)
                );
                list3.add(pr);    
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return list3;
    }
    
    public void addCart(String accountId,String productId,String amount){
        String sql="INSERT INTO HE141488_Cart values (?,?,?)";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, accountId);
            ps.setString(2, productId);
            ps.setString(3, amount);        
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public cart checkCart(String accountId,String productId){
        String sql="Select * from HE141488_Cart where accountId like ? AND productId like ?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, accountId);
            ps.setString(2, productId);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                return new cart(rs.getInt(1), rs.getInt(2), 
                        rs.getInt(3), rs.getInt(4));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public void updateCart(String amount, String id){
        String sql="Update HE141488_Cart set [amount] = ? Where id = ?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, amount);
            ps.setString(2, id);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteCart(String accountId, String pid){
        String sql="Delete from HE141488_Cart where productId like ? AND accountId like ?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, pid);
            ps.setString(2, accountId);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void addCheckOut(String accountId,String productId, String amount, String firstName, String lastName, String address,
            String phone, String email,String cardType, String cardNumber,Date date,Time time){
        String sql="INSERT INTO HE141488_checkOut values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, accountId);
            ps.setString(2, productId);
            ps.setString(3, amount);
            ps.setString(4, firstName);
            ps.setString(5, lastName);
            ps.setString(6, email);
            ps.setString(7, address);
            ps.setString(8, phone);
            ps.setString(9, cardType);
            ps.setString(10, cardNumber); 
            ps.setDate(11, (java.sql.Date) date);
            ps.setTime(12, time);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void placeOrder(Integer amount, String pid, Integer firstAmount){
        String sql="Update HE141488_product set [amount] = ? Where id = ?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setInt(1, firstAmount-amount);
            ps.setString(2, pid);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage()+1);
        }
    }
    
    public List<cart> takeCart(String accountId){
        list4 = new ArrayList<cart>();
        String sql = "Select * from HE141488_Cart where accountId=?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, accountId);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){ 
                cart c=new cart(rs.getInt(1), 
                        rs.getInt(2), 
                        rs.getInt(3), 
                        rs.getInt(4)
                );
                list4.add(c);    
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return list4;
    }
    
    public void updatePass(String id,String pass){
        String sql="Update HE141488_account set [pass] = ? Where id = ?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, pass);
            ps.setString(2, id);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void updateUser(String id,String firstName,String lastName,String email,
            String address,String phone){
        String sql="Update HE141488_user set [firstName] = ? , [lastName] = ? , [email] = ? ,"
                + "[address] = ? , [phone] = ?  Where accountId = ?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.setString(6, id);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<account> loadAccount(){
        listAccount = new ArrayList<account>();
        String sql="Select * from HE141488_account Where id > 1";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){ 
                account a=new account(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getBoolean(4)
                );
                listAccount.add(a);    
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return listAccount;
    }
    
    public List<user> loadUser(){
        listUser = new ArrayList<user>();
        String sql="Select * from HE141488_user Where id > 1";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){ 
                user a=new user(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3), 
                        rs.getString(4), 
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                );
                listUser.add(a);    
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return listUser;
    }
    
    public void deleteAll(String sql){
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public product getProductCoockie(String sql,String amount){
        product pr = null;
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                pr=new product(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getBigDecimal(4), 
                        rs.getInt(5), 
                        Integer.parseInt(amount), 
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getBoolean(10),
                        rs.getInt(11)
                );
            }
        }catch(Exception e){
            
        }
        return pr;
    }
    
    public account getAccount(String id){
        String sql="Select * from HE141488_account where id like ?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                return new account(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getBoolean(4));            
            }
        }catch(Exception e){
            
        }
        return null;
    }
    
    public List<String> loadTime(String id){
        ArrayList<String> list = new ArrayList<>();
        String sql="SELECT DISTINCT date, time\n" +
"FROM HE141488_checkOut where accountId = ? Order by date";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                list.add(rs.getDate(1)+" "+rs.getTime(2));
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public List<checkOut> loadCheckOut(String id){
        ArrayList<checkOut> list = new ArrayList<>();
        String sql="SELECT *\n" +
"FROM HE141488_checkOut where accountId = ?";
        try{
            PreparedStatement ps= con.prepareCall(sql);
            ps.setString(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                checkOut c = new checkOut(rs.getInt(1), 
                        rs.getInt(2), 
                        rs.getInt(3), 
                        rs.getInt(4), 
                        rs.getString(5), 
                        rs.getString(6),
                        rs.getString(7), 
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getDate(12), 
                        rs.getTime(13));
                list.add(c);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
}
