package TM02_Proj1;
//Project_1
public class TM02_Proj1 {

	public static void main(String[] args) {
		
		String[][] profile=new String[7][8];
		String[][] designation=new String[5][3];
		profile[0][0]= "1001";
		profile[0][1]= "Ashish";
		profile[0][2]= "01/04/2009";
		profile[0][3]= "e";
		profile[0][4]= "R&D";
		profile[0][5]= "20000";
		profile[0][6]= "8000";
		profile[0][7]= "3000";
		
		profile[1][0]= "1002";
		profile[1][1]= "Sushma";
		profile[1][2]= "23/08/2012";
		profile[1][3]= "c";
		profile[1][4]= "PM";
		profile[1][5]= "30000";
		profile[1][6]= "12000";
		profile[1][7]= "9000";
		
		profile[2][0]= "1003";
		profile[2][1]= "Rahul";
		profile[2][2]= "12/11/2008";
		profile[2][3]= "k";
		profile[2][4]= "acct";
		profile[2][5]= "10000";
		profile[2][6]= "8000";
		profile[2][7]= "1000";
		
		profile[3][0]= "1004";
		profile[3][1]= "Chahat";
		profile[3][2]= "29/1/2003";
		profile[3][3]= "r";
		profile[3][4]= "FrontDesk";
		profile[3][5]= "12000";
		profile[3][6]= "6000";
		profile[3][7]= "2000";
		
		profile[4][0]= "1005";
		profile[4][1]= "Ranjan";
		profile[4][2]= "16/07/2005";
		profile[4][3]= "m";
		profile[4][4]= "Engg";
		profile[4][5]= "50000";
		profile[4][6]= "20000";
		profile[4][7]= "20000";

		profile[5][0]= "1006";
		profile[5][1]= "Suman";
		profile[5][2]= "1/1/2000";
		profile[5][3]= "e";
		profile[5][4]= "Manufacturing";
		profile[5][5]= "23000";
		profile[5][6]= "9000";
		profile[5][7]= "4400";
		
		profile[6][0]= "1007";
		profile[6][1]= "Tanmay";
		profile[6][2]= "12/06/2006";
		profile[6][3]= "c";
		profile[6][4]= "PM";
		profile[6][5]= "29000";
		profile[6][6]= "12000";
		profile[6][7]= "10000";
		
		designation[0][0]="e";
		designation[0][1]="Engineer";
		designation[0][2]="20000";
		
		designation[1][0]="c";
		designation[1][1]="Consultant";
		designation[1][2]="32000";
		
		designation[2][0]="k";
		designation[2][1]="Clerk";
		designation[2][2]="12000";
		
		designation[3][0]="r";
		designation[3][1]="Receptionist";
		designation[3][2]="15000";
		
		designation[4][0]="m";
		designation[4][1]="Manager";
		designation[4][2]="40000";
		
		int i,j;
		String id = args[0];
		
		for(i=0;i<7;i++)
		{
			if(profile[i][0].equals(id))
			{

				
				
				System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\tSalary\n");
				
				System.out.print(profile[i][0]+"\t");
				
				System.out.print(profile[i][1]+"\t\t");
				
				System.out.print(profile[i][4]+"\t");
				
			
				for(j =0;j<5;j++)
				{	  
					if(profile[i][3].equals(designation[j][0]))
					{
						System.out.print(designation[j][1]+"\t");
						break;
						
					}
				}
				
				int sal,basic,hra,da,it;
				basic=Integer.parseInt(profile[i][5]);
				hra=Integer.parseInt(profile[i][6]);
				it=Integer.parseInt(profile[i][7]);
				da=Integer.parseInt(designation[j][2]);
				sal=basic+hra+da-it;
				System.out.print(sal);
				break;
				
			}
			else
			{
				if(i==6)
				System.out.println("There is no emp with empid : "+id);
				else
				continue;
			}	
		}	

	}

}
