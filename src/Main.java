import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){
        // Fill the code here
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of Members:");
    	int c=Integer.parseInt(sc.nextLine());
    	String s[]=new String[c];
    	List<Member> memberList = new ArrayList<Member>();
    	for(int i=0;i<c;i++) {
    		System.out.println("Enter the Member Details:");
    		s=sc.nextLine().split(":");
    		memberList.add(new Member(s[0],s[1],s[2]));
    		
    	}
    	System.out.println("Enter the number of times Membership category needs to be searched:");
    	c=Integer.parseInt(sc.nextLine());
    	ZEEShop zs[]=new ZEEShop[c];
    	String category;
    	for(int i =0;i<c;i++) {
    		System.out.println("Enter the Category");
    		category=sc.nextLine();
    		zs[i]=new ZEEShop(category,memberList);
    		zs[i].start();
    	}
    	for(ZEEShop z: zs) {
    		try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		System.out.println(z.getMemberCategory()+":"+z.getCount());
    	}
    	sc.close();
    }
}
