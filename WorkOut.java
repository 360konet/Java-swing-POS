package workout;

import javax.swing.*;
import java.awt.event.*;

public class WorkOut implements ActionListener{
    JFrame f;
    JButton div,div2,div3,cal,clear,print;
    JLabel l1,l2,l3,l4,l5,l6,qun,qun2,price,price2,rice,coke,milo,nido,bis,toffee,tot,tax,dis,pay,cash,momo,mtn,atm,voda,cryp,btc;
    JTextField id,name,num,trice,trp,tcoke,tcp,tmilo,tmp,tnido,tnp,tbis,tbp,ttof,ttp,ttot,ttax,tdis,tcash,tmtn,tatm,tvoda,tbtc;
    
    WorkOut(){
        f=new JFrame("Mickies Shopping Mart(SMS)");
       l1=new JLabel("Mickies Shopping Mart(SMS)");
       l1.setBounds(250,10,200,40);
       
       l2=new JLabel("Client Details");
       l2.setBounds(70,50,100,40);
       
       l3=new JLabel("Enter client ID");
       l3.setBounds(10,100,100,40);
       id=new JTextField();
       id.setBounds(125,100,100,40);
       
       l4=new JLabel("Enter client name");
       l4.setBounds(10,150,100,40);
       name=new JTextField();
       name.setBounds(125,150,100,40);
       
       l5=new JLabel("Enter phone number");
       l5.setBounds(10,200,150,40);
       num=new JTextField();
       num.setBounds(125,200,100,40);
       
       pay=new JLabel("Payment");
       pay.setBounds(80,250,100,40);
       
       cash=new JLabel("Cash paid(GHc)");
       cash.setBounds(10,300,100,40);
       tcash=new JTextField();
       tcash.setBounds(125,300,100,40);
       
       momo= new JLabel("Momo");
       momo.setBounds(80,350,100,40);
       
       mtn=new JLabel("MTN MoMo");
       mtn.setBounds(10,400,100,40);
       tmtn=new JTextField();
       tmtn.setBounds(125,400,100,40);
       
       atm=new JLabel("AirtelTigo cash");
       atm.setBounds(10,450,100,40);
       tatm=new JTextField();
       tatm.setBounds(125,450,100,40);
       
       voda=new JLabel("Vodafone cash");
       voda.setBounds(10,500,100,40);
       tvoda=new JTextField();
       tvoda.setBounds(125,500,100,40);
       
       cryp=new JLabel("CryptoCurrency");
       cryp.setBounds(80,550,100,40);
       
       btc=new JLabel("Bitcoin");
       btc.setBounds(10,600,100,40);
       tbtc=new JTextField();
       tbtc.setBounds(125,600,100,40);
       
       div=new JButton();
       div.setBounds(250,40,5,550);
       
       l6=new JLabel("Shopping List");
       l6.setBounds(400,50,120,40);
        
       qun=new JLabel("Quantity");
       qun.setBounds(300,70,100,40);
       
       price=new JLabel("Price(Ghc)");
       price.setBounds(360,70,100,40);
       
       rice=new JLabel("Rice");
       rice.setBounds(260,100,100,40);
       trice=new JTextField();
       trice.setBounds(300,100,40,40);
       trp=new JTextField();
       trp.setBounds(360,100,70,40);
       
       coke=new JLabel("Coke");
       coke.setBounds(260,150,100,40);
       tcoke=new JTextField();
       tcoke.setBounds(300,150,40,40);
       tcp=new JTextField();
       tcp.setBounds(360,150,70,40);
       
       milo=new JLabel("Milo");
       milo.setBounds(260,200,100,40);
       tmilo=new JTextField();
       tmilo.setBounds(300,200,40,40);
       tmp=new JTextField();
       tmp.setBounds(360,200,70,40);
       
       div2= new JButton();
       div2.setBounds(450,90,5,160);
       
       qun2=new JLabel("Quantity");
       qun2.setBounds(520,70,100,40);
       
       price2=new JLabel("Price(Ghc)");
       price2.setBounds(590,70,100,40);
       
       nido=new JLabel("Nido");
       nido.setBounds(470,100,100,40);
       tnido=new JTextField();
       tnido.setBounds(520,100,40,40);
       tnp=new JTextField();
       tnp.setBounds(590,100,70,40);
       
       bis=new JLabel("Biscuit");
       bis.setBounds(470,150,100,40);
       tbis=new JTextField();
       tbis.setBounds(520,150,40,40);
       tbp=new JTextField();
       tbp.setBounds(590,150,70,40);
       
       toffee=new JLabel("Toffee");
       toffee.setBounds(470,200,100,40);
       ttof=new JTextField();
       ttof.setBounds(520,200,40,40);
       ttp=new JTextField();
       ttp.setBounds(590,200,70,40);
       
       div3=new JButton();
       div3.setBounds(260,250,400,5);
       
       tax=new JLabel("Tax(Ghc)");
       tax.setBounds(260,259,100,40);
       ttax=new JTextField();
       ttax.setBounds(350,259,100,40);
       dis=new JLabel("Discount(Ghc)");
       dis.setBounds(260,300,100,40);
       tdis=new JTextField();
       tdis.setBounds(350,300,100,40);
       
       cal=new JButton("Calculate Bill");
       cal.setBounds(500,300,150,40);
       cal.addActionListener(this);
       
       tot=new JLabel("Bill(Ghc)");
       tot.setBounds(500,350,150,40);
       ttot=new JTextField();
       ttot.setBounds(550,350,100,40);
       
       clear=new JButton("Clear All");
       clear.setBounds(350,400,100,40);
       print=new JButton("Print Reciept");
       print.setBounds(500,400,150,40);
       
       
       f.add(l1);
       f.add(l2);
       
       f.add(l3);
       f.add(id);
       
       f.add(l4);
       f.add(name);
       
       f.add(l5);
       f.add(num);
       
       f.add(pay);
       f.add(cash);
       f.add(tcash);
       
       f.add(momo);
       
       f.add(mtn);
       f.add(tmtn);

       f.add(atm);
       f.add(tatm);
       
       f.add(voda);
       f.add(tvoda);
       
       f.add(cryp);
       f.add(btc);
       f.add(tbtc);
       
       f.add(l6);
       f.add(div);
       
       f.add(qun);
       f.add(price);
       
       f.add(rice);
       f.add(trice);
       f.add(trp);
       
       f.add(coke);
       f.add(tcoke);
       f.add(tcp);
       
       f.add(milo);
       f.add(tmilo);
       f.add(tmp);
       
       f.add(div2);
       f.add(qun2);
       f.add(price2);
       
       f.add(nido);
       f.add(tnido);
       f.add(tnp);
       
       f.add(bis);
       f.add(tbis);
       f.add(tbp);
       
       f.add(toffee);
       f.add(ttof);
       f.add(ttp);
       
       f.add(div3);
       f.add(tax);
       f.add(ttax);
       f.add(dis);
       f.add(tdis);
       
       f.add(cal);
       f.add(tot);
       f.add(ttot);
       
       f.add(clear);
       f.add(print);
       
       f.setSize(700,700);
       f.setLayout(null);
       f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        String rqu=trice.getText();
        String rpri=trp.getText();
        int a=Integer.parseInt(rqu);
        int b=Integer.parseInt(rpri);
        int ab=a*b;
        
        String cqu=tcoke.getText();
        String cpri=tcp.getText();
        int c=Integer.parseInt(cqu);
        int d=Integer.parseInt(cpri);
        int cd=c*d;
        
        String mqu=tmilo.getText();
        String mpri=tmp.getText();
        int ee=Integer.parseInt(mqu);
        int ff=Integer.parseInt(mpri);
        int ef=ee*ff;
        
        String nqu=tnido.getText();
        String npri=tnp.getText();
        int g=Integer.parseInt(nqu);
        int h=Integer.parseInt(npri);
        int gh=g*h;
        
        String bqu=tbis.getText();
        String bpri=tbp.getText();
        int i=Integer.parseInt(bqu);
        int j=Integer.parseInt(bpri);
        int ij=i*j;
        
        String tqu=ttof.getText();
        String tpri=ttp.getText();
        int k=Integer.parseInt(tqu);
        int l=Integer.parseInt(tpri);
        int kl=k*l;
        
        String tin=ttax.getText();
        int m=Integer.parseInt(tin);
        String discount=tdis.getText();
        int n=Integer.parseInt(discount);
        
        int tippy=0;
        tippy=((ab+cd+ef+gh+ij+kl)+m)-n;
        String ans=String.valueOf(tippy);
        ttot.setText(ans);
    }
    public static void main(String [] args){
        new WorkOut();
    }
}