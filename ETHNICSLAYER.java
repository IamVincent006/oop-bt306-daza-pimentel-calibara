import java.util.InputMismatchException;
import java.util.Scanner;

interface Dialogue{
    void setStoryLUZON();
    void setStoryVISAYAS();
    void setStoryMINDANAO();
}
abstract class printOutput implements Dialogue {
// Process - for displaying total output of player
    public abstract void printResult();
     
    public abstract void  gender();
    public abstract void  status();
    public abstract void  religion();
    public abstract void  hobby();
    public abstract void  persona();
    
    public abstract void  skin();
    public abstract void  fcShape();
    public abstract void  mataKly();
    public abstract void  hrStyle();
    public abstract void  hrKolor();
    public abstract void  bdyTyp();
    public abstract void  height();
    public abstract void  cloths();
    public abstract void  accsrs();
    
    public abstract void wpn();
    public abstract void armor();
    public abstract void agimat();
    public abstract void passiveSkl();
}
class duperClass extends printOutput{
    
    
    private String gender;
    private String status;
    private String religion;
    private String hobby;
    private String persona;
    
    private String skin;
    private String fcShape;
    private String mataKly;
    private String hrStyle;
    private String hrKolor;
    private String bdyTyp;
    private double height;
    private String cloths;
    private String accsrs;
    
    private String wpn;
    private String armor;
    private String agimat;
    private String passiveSkl;

//    public duperClass(int gender, int status, int religion, int hobby, int persona,int skin, int fcShape, int mataKly, int hrStyle, int hrKolor,int bdyTyp, double height, int cloths, int accsrs,int wpn, int armor, int agimat, int passiveSkl) {
    	public duperClass(String gender, String status, String religion, String hobby, String persona,String skin, String fcShape,String mataKly, String hrStyle, String hrKolor,String bdyTyp, double height, String cloths, String accsrs,String wpn,String armor,String agimat, String passiveSkl) {

    	this.gender = gender;
        this.status = status;
        this.religion = religion;
        this.hobby = hobby;
        this.persona = persona;
        this.skin = skin;
        this.fcShape = fcShape;
        this.mataKly = mataKly;
        this.hrStyle = hrStyle;
        this.hrKolor = hrKolor;
        this.bdyTyp = bdyTyp;
        this.height = height;
        this.cloths = cloths;
        this.accsrs = accsrs;
        this.wpn = wpn;
        this.armor = armor;
        this.agimat = agimat;
        this.passiveSkl = passiveSkl;
    }
    public duperClass() {
	// TODO Auto-generated constructor stub
}
	// Abstract method for setStory() to be implemented in subclasses
    
	@Override
	public void printResult() {
		// TODO Auto-generated method stub
		
	}
	
	void choiceNum(String a){
		System.out.println("Select for only true or false");
	}
	void choiceNum(String b, String d) {
		System.out.println("Select for only from 1 - 3");
	}
	void choiceNum(String b, String d, String c) {
		System.out.println("Select for only from 1 - 5");
	}
	void choiceNum(String b, String d, String c, String a) {
		System.out.println("Select for only from 1 - 4");
	}
	
	@Override
	public void gender() {
		System.out.println("Gender: "+gender);
	}
	@Override
	public void status() {
		System.out.println("Status: "+status);
		
	}
	@Override
	public void religion() {
		System.out.println("Religion: "+religion);
		
	}
	@Override
	public void hobby() {
		System.out.println("Hobby: "+hobby);
		
	}
	@Override
	public void persona() {
		System.out.println("Persona: "+persona);
		
	}
	@Override
	public void skin() {
		System.out.println("Skin: "+skin);
		
	}
	@Override
	public void fcShape() {
		System.out.println("Face Shape: "+fcShape);
		
	}
	@Override
	public void mataKly() {
		System.out.println("Matay Kilay: "+mataKly);
		
	}
	@Override
	public void hrStyle() {
		System.out.println("Hair Style: "+hrStyle);
		
	}
	@Override
	public void hrKolor() {
		System.out.println("Hair Color: "+hrKolor);
		
	}
	@Override
	public void bdyTyp() {
		System.out.println("Body Type: "+bdyTyp);
		
	}
	@Override
	public void height() {
		System.out.println("Height: "+height);
		
	}
	@Override
	public void cloths() {
		System.out.println("Clothes: "+cloths);
		
	}
	@Override
	public void accsrs() {
		System.out.println("Accessories: "+accsrs);
		
	}
	@Override
	public void wpn() {
		System.out.println("Weapon: "+wpn);
		
	}
	@Override
	public void armor() {
		System.out.println("Armor: "+armor);
		
	}
	@Override
	public void agimat() {
		System.out.println("Agimat: "+agimat);
		
	}
	@Override
	public void passiveSkl() {
		System.out.println("Passive Skill: "+passiveSkl);
		
	}    
	
	public String getGender() {
		return gender;	
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public String getStutus() {
		return status;	
	}
	
	public void setStatus(String status) {
		this.status=status;
	}
	
	public String getReligion() {
		return religion;	
	}
	
	public void setReligion(String religion) {
		this.religion=religion;
	}
	public String getHobby() {
		return hobby;	
	}
	
	public void setHobby(String hobby) {
		this.hobby=hobby;
	}
	public String getPersona() {
		return persona;	
	}
	
	public void setPersona(String persona) {
		this.persona=persona;
	}
	public String getSkin() {
		return status;	
	}
	
	public void setSkin(String skin) {
		this.skin=skin;
	}
	public String getFaceshape() {
		return fcShape;	
	}
	
	public void setFaceshape(String faceshape) {
		this.fcShape=faceshape;
	}
	public String getMatakilay() {
		return mataKly;	
	}
	
	public void setMatakilay(String mata) {
		this.mataKly=mata;
	}
	public String getHairstyle() {
		return hrStyle;	
	}
	
	public void setHairstyle(String hairstyle) {
		this.hrStyle=hairstyle;
	}
	public String gethrKolor() {
		return hrKolor;	
	}
	
	public void sethrKolor(String haircolor) {
		this.hrKolor=haircolor;
	}
	public String getbdyTyp() {
		return bdyTyp;	
	}
	
	public void setbdyTyp(String bodytype) {
		this.bdyTyp=bodytype;
	}
	public double getheight() {
		return height;	
	}
	
	public void setheight(double height) {
		this.height=height;
	}
	public String getClothes() {
		return cloths;	
	}
	
	public void setClothes(String Clothes) {
		this.cloths=Clothes;
	}
	public String getAccesories() {
		return accsrs;	
	}
	
	public void setAccesories(String accesories) {
		this.accsrs=accesories;
	}
	public String getWeapon() {
		return wpn;	
	}
	
	public void setWeapon(String Weapon) {
		this.wpn=Weapon;
	}
	public String getArmor() {
		return armor;	
	}
	
	public void setArmor(String armor) {
		this.armor=armor;
	}
	public String getAgimat() {
		return agimat;	
	}
	
	public void setAgimat(String agimat) {
		this.agimat=agimat;
	}
	public String getPassive() {
		return passiveSkl;	
	}
	
	public void setPassive(String passive) {
		this.passiveSkl=passive;
	}
	@Override
	public void setStoryLUZON() {
		System.out.println(";This will where I'll put the story of luzonians instead of main class");
    	System.out.println("---------------------------------------");
        System.out.println("\nYou are now Tagalog");
        System.out.println("---------------------------------------");
        System.out.println("As a Luzonian, you navigate the complexities of a society plagued by a cancerous spread of fake news, social climbing, and deceit. ");
        System.out.println("Your mission is to uncover the truth, restore trust among the people, ");
        System.out.println("and dismantle the web of lies threatening to tear your civilization apart.");
        System.out.println("---------------------------------------");
	}	
	public void setStoryVISAYA() {
		System.out.println("=======================================");
        System.out.println("You are now Bisaya");
        System.out.println("=======================================");
        System.out.println("Choosing the path of a Visayan, you embark on a journey filled with mythical creatures and supernatural forces. ");
        System.out.println("Face tikbalangs, outwit mangkukulams, challenge mangbabarangs, and negotiate with engkantos. ");
        System.out.println("Your choices will determine whether superstition binds your people or if you can harness the mystical forces for the greater good.");
        System.out.println("=======================================");
	}	
	
	public void setStoryMINDANAO() {
		 System.out.println("=======================================");
		        System.out.println("You are now Maranao");
		        System.out.println("=======================================");
		        System.out.println("Embrace the spirit of the Mindanao people, where the land is rich with diverse tribes but shadows of war loom large. ");
		        System.out.println("Navigate the complexities of tribal alliances, confront the threat of terrorism, and strive to bring peace to a land torn apart by conflict. ");
		        System.out.println("Your choices will determine the fate of your people in the face of adversity.");
		        System.out.println("=======================================");
	}
	@Override
	public void setStoryVISAYAS() {
		// TODO Auto-generated method stub
		
	}	
	
}


public class ETHNICSLAYER {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        duperClass duper = new duperClass();
        duper.choiceNum("a");
        
        //iPO - Question 1: Are you Filipino?
                while(true){
                    try{
                        System.out.println("Are you Filipino? (True/False)");
                            boolean isFilipino = sc.nextBoolean();
                                if(isFilipino) {
                                // Display character profile and short story based on language choice
                                    System.out.println("---------------------------------------");
                                    System.out.println("Ang larong ito ay pabiro lamang at hindi para sa taong hindi makatanggap ng joke");
                                    System.out.println("---------------------------------------");
                                // Display character profile and short story in Filipino language
                                // Add logic for displaying the character profile and story in Filipino language
                                    System.out.println("Noong unang panahon, sa kahanga-hangang kapuluan ng Pilipinas, tatlong natatanging sibilisasyon ang umunlad nang magkakasama: ang mga taga-Luzon,  ");
                                    System.out.println("na may kanilang masiglang lipunan; ang mga taga-Visayas, na malalim na konektado sa pamahiin at sa kababalaghan; at ang mga taga-Mindanao, ");
                                    System.out.println("na tahimik na namumuhay sa gitna ng kanilang iba't ibang tribo. ");
                                    System.out.println("Ngunit, isang malaking dilim ang nagbabadya na magdadala ng anino sa mga lupain na ito. ");
                                    System.out.println("Hinulaan na may darating na kamangha-manghang indibidwal, may kakayahan na pagbuklurin ang magkakaibang kultura at ibalik ang balanse sa mga isla. ");
                                    System.out.println("Ang paglalakbay ay nagsisimula ngayon.");
                                    System.out.println("\n\n---------------------------------------");
                                        break;
                                    }   
                                else{
                                    System.out.println("---------------------------------------");
                                    System.out.println("Warning, This game is satire and in all intents in purposes a joke, please close the game if you aren't up to it");
                                    System.out.println("---------------------------------------");
                                // Display character profile and short story in English
                                // Add logic for displaying the character profile and story in English
                                    System.out.println("In the mystical archipelago of the Philippines, three distinct civilizations thrived: ");
                                    System.out.println("the Luzonians, known for their advanced and civilized society; ");
                                    System.out.println("the Visayans, steeped in superstitions  ");
                                    System.out.println("and the Mindanao people, living in harmony with their tribes but facing the shadows of war. ");
                                    System.out.println("Legend foretold that a chosen one would emerge to unite these diverse cultures and bring balance to the islands,");
                                    System.out.println(" just as the Avatar did for the four nations.");
                                    System.out.println("\n\n---------------------------------------");
                                        break;
                                    }
                        }catch (Exception e){
                            System.out.println("\nInvalid input, Please re-input your answer\n");
                            sc.next();
                        }
                    }
                
                
                duper.choiceNum("a", "b");
                while(true){
                    System.out.println("---------------------------------------");
                    System.out.println("Choose your Ethnicity: ");
                    System.out.println("1.TagaLuzon, 2.TagaVisayas, 3.TagaMindanao");
                    System.out.println("---------------------------------------");
                    try{    
                    int racism = sc.nextInt();
                            if (racism == 1){
                            	duper.choiceNum("a", "b", "c");
                String gender="";
                
                while (true) {
                	System.out.print("Select 1. Lalake, 2. Babae, 3. Bakla, 4. Tomboy, 5. LGTV ");
                	try {
                	int choice = sc.nextInt();
                	
                	if (choice == 1){
                        gender = "Lalake";
                        break;
                    }
                    else if (choice == 2){
                    	gender = "Babae";
                        break;
                    }
                    else if (choice == 3){
                    	gender = "Bakla";
                        break;
                    }
                    else if (choice == 4){
                    	gender = "Tomboy";
                        break;
                    }
                    else if (choice == 5){
                    	gender = "LGTV";
                        break;
                    }}
                		catch(InputMismatchException e) {
                			System.out.println("Invalid Input...");
                			sc.next();
                		}              	              		
                	}
                
    
    			String status="";
    			while (true) {
    				System.out.print("Select 1. Student, 2. Employee, 3. Tambay, 4. Breadwinner, 5. Beggar ");
    				try {
    				int choice = sc.nextInt();
    				
    					if (choice == 1){
    	                    status = "Student";
    	                    break;
    	                }
    	                else if (choice == 2){
    	                    status = "Employee";
    	                    break;
    	                }
    	                else if (choice == 3){
    	                    status = "Tambay";
    	                    break;
    	                }
    	                else if (choice == 4){
    	                    status = "Breadwinner";
    	                    break;
    	                }
    	                else if (choice == 5){
    	                    status = "Beggar";
    	                    break;
    	                }}
    				catch(InputMismatchException e) {
    						System.out.println("Invalid Input...");
    						sc.next();
    				}              	              		
    			}
    			
    String religion="";
	while (true) {
		System.out.print("Select 1. Catholic, 2. INC, 3. Christian, 4. Bornagain, 5. MCGI ");
		try {
		int choice = sc.nextInt();
    if (choice == 1){
    	religion = "Catholic";
    	break;
    }
    else if (choice == 2){
    	religion = "INC";
    	break;
    }
    else if (choice == 3){
    	religion = "Christian";
    	break;
    }
    else if (choice == 4){
    	religion = "Bornagain";
    	break;
    }
    else if (choice == 5){
    	religion = "MCGI";
    	break;
    }}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input...");
			sc.next();
	}              	              		
}
    
    String hobby = "";
   	while (true) {
   		System.out.print("Select 1. Gamer, 2. Magluto, 3. Mag drawing, 4. Kumanta, 5. Sumayaw ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
                hobby = "Gamer";
                break;
            }
            else if(choice ==2){
                hobby = "Magluto";
                break;
            }
            else if(choice == 3){
                hobby = "Mag drawing";
                break;
            }
            else if (choice ==4){
                hobby = "Kumanta";
                break;
            }
            else if (choice == 5){
                hobby = "Sumayaw";
                break;
            }}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	
   	String persona = "";
   	while (true) {
   		System.out.print("Select 1. Introvert, 2. Extrovert, 3. Omnivert, 4. Ambivert, 5. Pervert ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
   				persona= "Introvert";
   				break;
   			}
            else if(choice ==2){
            	persona = "Extrovert";
            	break;
            }
            else if(choice == 3){
            	persona= "Omnivert";
            	break;
            }
            else if (choice ==4){
            	persona= "Ambivert";
            	break;
            }
            else if (choice == 5){
            	persona = "Pervert";
            	break;
            }
}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	
    
   	String skin = "";
   	while (true) {
   		System.out.print("Select 1. kayumanggi, 2. Maitim, 3. Maputi, 4. Naninilaw, 5. Tan Gold ");
   		try {
   			int choice = sc.nextInt();
   		 if(choice == 1){
   			skin = "kayumanggi";
   			break;
         }
         else if(choice ==2){
        	 skin = "Maitim";
        	 break;
         }
         else if(choice == 3){
        	 skin = "Maputi";
        	 break;
         }
         else if (choice ==4){
        	 skin = "Naninilaw";
        	 break;
         }
         else if (choice == 5){
        	 skin = "Tan Gold";
        	 break;
         }}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	
   	String face = "";
   	while (true) {
   		System.out.print("Select 1. Bilugan, 2. Paiskwer, 3. Hababa, 4. Pa oblong, 5. Paheart ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
                face = "Bilugan";
                break;
            }
            else if(choice ==2){
                face = "Paiskwer";
                break;
            }
            else if(choice == 3){
                face = "Hababa";
                break;
            }
            else if (choice == 4){
                face = "Pa oblong";
                break;
            }
            else if (choice == 5){
                face = "Paheart";
                break;
            }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
    
   	String eyes = "";
   	while (true) {
   		System.out.print("Select 1. Black, 2. Brown, 3. Blue, 4. Red, 5. Green ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
   				eyes = "Black";
   				break;
            }
            else if(choice ==2){
            	eyes =  "Brown";
            	break;
            }
            else if(choice == 3){
            	eyes =  "Blue";
            	break;
            }
            else if (choice ==4){
            	eyes =  "Red";
            	break;
            }
            else if (choice == 5){
                eyes =  "Green";
                break;
            }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	
	String hair = "";
   	while (true) {
   		System.out.print("Select 1. Mushroom, 2. Kempee, 3. Gupit Binata/Dalaga, 4. Dreadlocks, 5. Wally’s Cut ");
   		try {
   			int choice = sc.nextInt();
   		 if(choice == 1){
   			hair = "Mushroom";
   			break;
         }
         else if(choice ==2){
        	 hair= "Kempee";
        	 break;
         }
         else if(choice == 3){
        	 hair = "Gupit Binata/Dalaga";
        	 break;
         }
         else if (choice ==4){
        	 hair = "Dreadlocks";
        	 break;
         }
         else if (choice == 5){
        	 hair = "Wally’s Cut";
        	 break;
         }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}           	              		
   }
   	
   	String fcShape = "";
   	while (true) {
   		System.out.print("Select 1. Bilugan, 2. Paiskwer, 3. Hababa, 4. Pa oblong, 5. Paheart ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
   				fcShape = "Bilugan";
   				break;
            }
            else if(choice ==2){
            	fcShape = "Paiskwer";
            	break;
            }
            else if(choice == 3){
            	fcShape = "Hababa";
            	break;
            }
            else if (choice == 4){
            	fcShape = "Pa oblong";
            	break;
            }
            else if (choice == 5){
            	fcShape = "Paheart";
            	break;
            }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	
   	String mataKly = "";
   	while (true) {
   		System.out.print("Select 1. Black, 2. Brown, 3. Blue, 4. Red, 5. Green ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
   				mataKly = "Black";
   				break;
            }
            else if(choice ==2){
            	mataKly =  "Brown";
            	break;
            }
            else if(choice == 3){
            	mataKly =  "Blue";
            	break;
            }
            else if (choice ==4){
            	mataKly =  "Red";
            	break;
            }
            else if (choice == 5){
            	mataKly =  "Green";
            	break;
            }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	
   	
   	String hrKolor = "";
   	while (true) {
   		System.out.print("Select 1. Black, 2. Blonde, 3. Ash Gray, 4. Red, 5. Orange ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
   				hrKolor = "Black";
                break;
            }
            else if(choice ==2){
            	hrKolor = "Blonde";
                break;
            }
            else if(choice == 3){
            	hrKolor = "Ash Gray";
                break;
            }
            else if (choice ==4){
            	hrKolor = "Red";
                break;
            }
            else if (choice == 5){
            	hrKolor = "Orange";
                break;
            }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	
   	String bdyTyp = "";
   	while (true) {
   		System.out.print("Select 1. Payatot, 2. Mataba, 3. Maskulado, 4. Gasul body, 5. Coca Cola body ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
   				bdyTyp = "Payatot";
                break;
            }
            else if(choice ==2){
            	bdyTyp = "Mataba";
                break;
            }
            else if(choice == 3){
            	bdyTyp = "Maskulado";
                break;
            }
            else if (choice ==4){
            	bdyTyp = "Gasul body";
                break;
            }
            else if (choice == 5){
            	bdyTyp = "Coca Cola body";
                break;
            }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	duper.choiceNum("a", "b", "c", "d");
   	double height =0;
   	while (true) {
   		System.out.print("Select 1. 40%, 2. 70%, 3. 100%, 4. 120% ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
   				height = 40;
                break;
            }
            else if(choice ==2){
            	height =  70;
                break;
            }
            else if(choice == 3){
            	height =  100;
                break;
            }
            else if (choice ==4){
            	height =  120;
                break;
            }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	duper.choiceNum("a", "b", "c");
   	String cloths = "";
   	while (true) {
   		System.out.print("Select 1. Y2K, 2. Sleepwear, 3. Old School, 4. Naka barong Tagalog, 5. Nakapang business suit ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
   				cloths = "Y2K";
   				break;
            }
            else if(choice ==2){
            	cloths = "Sleepwear";
            	break;
            }
            else if(choice == 3){
            	cloths = "Old School";
            	break;
            }
            else if (choice ==4){
            	cloths = "Naka barong Tagalog";
            	break;
            }
            else if (choice == 5){
            	cloths = "Nakapang business suit";
            	break;
            }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	
   	String accsrs = "";
   	while (true) {
   		System.out.print("Select 1. Earings, 2. Necklace, 3. Ring, 4. Eye glasses, 5. Watch ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
   				cloths = "Earings";
                break;
            }
            else if(choice ==2){
            	cloths = "Necklace";
                break;
            }
            else if(choice == 3){
            	cloths = "Ring";
                break;
            }
            else if (choice ==4){
            	cloths = "Eye glasses";
                break;
            }
            else if (choice == 5){
            	cloths = "Watch";
                break;
            }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	
   	String wpn = "";
   	while (true) {
   		System.out.print("Select 1. Hanger, 2. Walis Tambo, 3. Tsinelas, 4. Balisong, 5. Batuta ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
   				wpn = "Hanger";
                break;
            }
            else if(choice ==2){
            	wpn = "Walis Tambo";
                break;
            }
            else if(choice == 3){
            	wpn = "Tsinelas";
                break;
            }
            else if (choice ==4){
            	wpn = "Balisong";
                break;
            }
            else if (choice == 5){
            	wpn = "Batuta";
                break;
            }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	
   	
   	String armor = "";
   	while (true) {
   		System.out.print("Select 1. Salakot Spaulders, 2. Bilao Targe, 3. Cardo’s Plate, 4. Sara’s Face, 5. The Man’s Feelings ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
   				armor = "Salakot Spaulders";
   				break;
            }
            else if(choice ==2){
            	armor = "Bilao Targe";
            	break;
            }
            else if(choice == 3){
            	armor = "Cardo’s Plate";
            	break;
            }
            else if (choice ==4){
            	armor = "Sara’s Face";
            	break;
            }
            else if (choice == 5){
            	armor = "The Man’s Feelings";
            	break;
            }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");sc.next();
   	}              	              		
   }
   	
   	String agimat = "";
   	while (true) {
   		System.out.print("Select 1. Agimat ni ApoLaki, 2. Agimat ng Gagamba, 3. Agimat ng Bakunawa, 4. Palikpik ng Syokoy, 5. Agimat ng Santelmo ");
   		try {
   			int choice = sc.nextInt();
   			if(choice == 1){
   				agimat = "Agimat ni ApoLaki";
                break;
            }
            else if(choice ==2){
            	agimat = "Agimat ng Gagamba";
                break;
            }
            else if(choice == 3){
            	agimat = "Agimat ng Bakunawa";
                break;
            }
            else if (choice ==4){
            	agimat = "Palikpik ng Syokoy";
                break;
            }
            else if (choice == 5){
            	agimat = "Agimat ng Santelmo";
                break;
            }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");
   			sc.next();
   	}              	              		
   }
   	
   	String passiveSkl = "";
   	while (true) {
   	 System.out.println("Ability: ");
     System.out.println("1.Mosang. Can hear from far away ");
     System.out.println("2.Sharp Tongue: Can critical damage the enemy with words");
     System.out.println("3.Ghosting: Disappears Randomly");
     System.out.println("4.Cancer: Debuffs everyone on the field (including allies) ");
     System.out.println("5.Retirement Plan: Strongest support that can provide anything. Decreases HP, MP and Sanity every action");
   		try {
   			int choice = sc.nextInt();
   		 if(choice == 1){
   			passiveSkl = "Mosang";
             break;
         }
         else if(choice ==2){
        	 passiveSkl = "Sharp Tongue";
             break;
         }
         else if(choice == 3){
        	 passiveSkl = "Ghosting";
             break;
         }
         else if (choice ==4){
        	 passiveSkl = "Cancer";
             break;
         }
         else if (choice == 5){
        	 passiveSkl = "Retirement Plan";
             break;
         }
   			}
   		catch(InputMismatchException e) {
   			System.out.println("Invalid Input...");sc.next();
   	}              	              		
   }
   	
   	duperClass luzon = new duperClass(gender,  status,  religion,  hobby,  persona, skin,  fcShape, mataKly,  hair,  hrKolor, bdyTyp,  height,  cloths,  accsrs, wpn, armor, agimat,  passiveSkl); 
   	luzon.setStoryLUZON();
   	System.out.println("=======================================");
    System.out.println("Chosen Ethnicity: Taga-Luzon");
	System.out.println("---------------------------------------");
   	luzon.gender();
   	luzon.status();
   	luzon.religion();
   	luzon.hobby();
   	luzon.persona();
   	luzon.skin();
   	luzon.fcShape();
   	luzon.mataKly();
   	luzon.hrStyle();
   	luzon.hrKolor();
   	luzon.bdyTyp();
   	luzon.height();
   	luzon.cloths();
   	luzon.accsrs();
   	luzon.wpn();
   	luzon.armor();
   	luzon.agimat();
   	luzon.passiveSkl();
   	
break; 
   	//luzon
                            } else if (racism == 2){
                                duper.choiceNum("a", "b");

                            	String gender="";
                                while (true) {
                                	System.out.print("Select 1. Dudong, 2. Inday, 3. Bayot, 4. Shiboli, 5. Bisexual");
                                	try {
                                	int choice = sc.nextInt();
                                	if (choice == 1){
                                		gender= "Dudong";
                                		break;
                                    }
                                    else if (choice == 2){
                                    	gender= "Inday";
                                    	break;
                                    }
                                    else if (choice == 3){
                                    	gender= "Bayot";
                                    	break;
                                    }
                                    else if (choice == 4){
                                    	gender= "Shiboli";
                                    	break;
                                    }
                                    else if (choice == 5){
                                    	gender= "Bisexual";
                                    	break;
                                    }
                
                                	}
                                		catch(InputMismatchException e) {
                                			System.out.println("Invalid Input...");
                                			sc.next();
                                		}              	              		
                                	}
                                
                                String status="";
                    			while (true) {
                    				System.out.print("Select 1. Student, 2. Employee, 3. Tambay, 4. Breadwinner, 5. Beggar ");
                    				try {
                    				int choice = sc.nextInt();
                    				
                    					if (choice == 1){
                    	                    status = "Student";
                    	                    break;
                    	                }
                    	                else if (choice == 2){
                    	                    status = "Employee";
                    	                    break;
                    	                }
                    	                else if (choice == 3){
                    	                    status = "Tambay";
                    	                    break;
                    	                }
                    	                else if (choice == 4){
                    	                    status = "Breadwinner";
                    	                    break;
                    	                }
                    	                else if (choice == 5){
                    	                    status = "Beggar";
                    	                    break;
                    	                }}
                    				catch(InputMismatchException e) {
                    						System.out.println("Invalid Input...");
                    						sc.next();
                    				}              	              		
                    			}
                    			
                    String religion="";
                	while (true) {
                		System.out.print("Select 1. Catholic, 2. INC, 3. Christian, 4. Bornagain, 5. Dating daan ");
                		try {
                		int choice = sc.nextInt();
                    if (choice == 1){
                    	religion = "Catholic";
                    	break;
                    }
                    else if (choice == 2){
                    	religion = "INC";
                    	break;
                    }
                    else if (choice == 3){
                    	religion = "Christian";
                    	break;
                    }
                    else if (choice == 4){
                    	religion = "Bornagain";
                    	break;
                    }
                    else if (choice == 5){
                    	religion = "Dating daan";
                    	break;
                    }}
                		catch(InputMismatchException e) {
                			System.out.println("Invalid Input...");
                			sc.next();
                	
                    }              	              		
                }
                    
                    String hobby = "";
                   	while (true) {
                   		System.out.print("Select 1. Gamer, 2. Magluto, 3. Mag drawing, 4. Kumanta, 5. Sumayaw ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                                hobby = "Gamer";
                                break;
                            }
                            else if(choice ==2){
                                hobby = "Magluto";
                                break;
                            }
                            else if(choice == 3){
                                hobby = "Mag drawing";
                                break;
                            }
                            else if (choice ==4){
                                hobby = "Kumanta";
                                break;
                            }
                            else if (choice == 5){
                                hobby = "Sumayaw";
                                break;
                            }}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String persona = "";
                   	while (true) {
                   		System.out.print("Select 1. Introvert, 2. Extrovert, 3. Omnivert, 4. Ambivert, 5. Pervert ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				persona= "Introvert";
                   				break;
                   			}
                            else if(choice ==2){
                            	persona = "Extrovert";
                            	break;
                            }
                            else if(choice == 3){
                            	persona= "Omnivert";
                            	break;
                            }
                            else if (choice ==4){
                            	persona= "Ambivert";
                            	break;
                            }
                            else if (choice == 5){
                            	persona = "Pervert";
                            	break;
                            }
                }
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                    
                   	String skin = "";
                   	while (true) {
                   		System.out.print("Select 1. kayumanggi, 2. Maitim, 3. Maputi, 4. Naninilaw, 5. Tan Gold ");
                   		try {
                   			int choice = sc.nextInt();
                   		 if(choice == 1){
                   			skin = "kayumanggi";
                   			break;
                         }
                         else if(choice ==2){
                        	 skin = "Maitim";
                        	 break;
                         }
                         else if(choice == 3){
                        	 skin = "Maputi";
                        	 break;
                         }
                         else if (choice ==4){
                        	 skin = "Naninilaw";
                        	 break;
                         }
                         else if (choice == 5){
                        	 skin = "Tan Gold";
                        	 break;
                         }}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String face = "";
                   	while (true) {
                   		System.out.print("Select 1. Ma-panga, 2. Paiskwer, 3. Hababa, 4. Pa oblong, 5. Paheart ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                                face = "Ma-panga";
                                break;
                            }
                            else if(choice ==2){
                                face = "Paiskwer";
                                break;
                            }
                            else if(choice == 3){
                                face = "Hababa";
                                break;
                            }
                            else if (choice == 4){
                                face = "Pa oblong";
                                break;
                            }
                            else if (choice == 5){
                                face = "Paheart";
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                    
                   	String eyes = "";
                   	while (true) {
                   		System.out.print("Select 1. Black, 2. Brown, 3. Blue, 4. Red, 5. Green ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				eyes = "Black";
                   				break;
                            }
                            else if(choice ==2){
                            	eyes =  "Brown";
                            	break;
                            }
                            else if(choice == 3){
                            	eyes =  "Blue";
                            	break;
                            }
                            else if (choice ==4){
                            	eyes =  "Red";
                            	break;
                            }
                            else if (choice == 5){
                                eyes =  "Green";
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                	String hair = "";
                   	while (true) {
                   		System.out.print("Select 1. Taper Fade, 2. Buzz Cut, 3. Under cut, 4. Dreadlocks, 5. Wally’s Cut ");
                   		try {
                   			int choice = sc.nextInt();
                   		 if(choice == 1){
                   			hair = "Taper Fade";
                   			break;
                         }
                         else if(choice ==2){
                        	 hair= "Buzz Cut";
                        	 break;
                         }
                         else if(choice == 3){
                        	 hair = "Under cut";
                        	 break;
                         }
                         else if (choice ==4){
                        	 hair = "Dreadlocks";
                        	 break;
                         }
                         else if (choice == 5){
                        	 hair = "Wally’s Cut";
                        	 break;
                         }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String fcShape = "";
                   	while (true) {
                   		System.out.print("Select 1. Bilugan, 2. Paiskwer, 3. Hababa, 4. Pa oblong, 5. Paheart ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				fcShape = "Bilugan";
                   				break;
                            }
                            else if(choice ==2){
                            	fcShape = "Paiskwer";
                            	break;
                            }
                            else if(choice == 3){
                            	fcShape = "Hababa";
                            	break;
                            }
                            else if (choice == 4){
                            	fcShape = "Pa oblong";
                            	break;
                            }
                            else if (choice == 5){
                            	fcShape = "Paheart";
                            	break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String mataKly = "";
                   	while (true) {
                   		System.out.print("Select 1. Black, 2. Brown, 3. Blue, 4. Red, 5. Green ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				mataKly = "Black";
                   				break;
                            }
                            else if(choice ==2){
                            	mataKly =  "Brown";
                            	break;
                            }
                            else if(choice == 3){
                            	mataKly =  "Blue";
                            	break;
                            }
                            else if (choice ==4){
                            	mataKly =  "Red";
                            	break;
                            }
                            else if (choice == 5){
                            	mataKly =  "Green";
                            	break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	
                   	String hrKolor = "";
                   	while (true) {
                   		System.out.print("Select 1. Black, 2. Blonde, 3. Ash Gray, 4. Red, 5. Orange ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				hrKolor = "Black";
                                break;
                            }
                            else if(choice ==2){
                            	hrKolor = "Blonde";
                                break;
                            }
                            else if(choice == 3){
                            	hrKolor = "Ash Gray";
                                break;
                            }
                            else if (choice ==4){
                            	hrKolor = "Red";
                                break;
                            }
                            else if (choice == 5){
                            	hrKolor = "Orange";
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String bdyTyp = "";
                   	while (true) {
                   		System.out.print("Select 1. Payatot, 2. Mataba, 3. Maskulado GYUD, 4. Gasul body, 5. Coca Cola body ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				bdyTyp = "Payatot";
                                break;
                            }
                            else if(choice ==2){
                            	bdyTyp = "Mataba";
                                break;
                            }
                            else if(choice == 3){
                            	bdyTyp = "Maskulado GYUD";
                                break;
                            }
                            else if (choice ==4){
                            	bdyTyp = "Gasul body";
                                break;
                            }
                            else if (choice == 5){
                            	bdyTyp = "Coca Cola body";
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	duper.choiceNum("a", "b", "c", "d");
                   	double height =0;
                   	while (true) {
                   		System.out.print("Select 1. 40%, 2. 70%, 3. 100%, 4. 120% ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				height = 40;
                                break;
                            }
                            else if(choice ==2){
                            	height =  70;
                                break;
                            }
                            else if(choice == 3){
                            	height =  100;
                                break;
                            }
                            else if (choice ==4){
                            	height =  120;
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	duper.choiceNum("a", "b", "c");
                   	String cloths = "";
                   	while (true) {
                   		System.out.print("Select 1. Hypebeast, 2. Topless /w Maong at Rambo na tsinelas, 3. Kimona at  Patadyong, 4. Tshirt /w Politician logo, 5.Sleepwear ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				cloths = "Hypebeast";
                   				break;
                            }
                            else if(choice ==2){
                            	cloths = "Topless /w Maong at Rambo na tsinelas";
                            	break;
                            }
                            else if(choice == 3){
                            	cloths = "Kimona at  Patadyong";
                            	break;
                            }
                            else if (choice ==4){
                            	cloths = "Tshirt /w Politician logo";
                            	break;
                            }
                            else if (choice == 5){
                            	cloths = "Sleepwear";
                            	break;
                            }
                   			}
                   		
                   	
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String accsrs = "";
                   	while (true) {
                   		System.out.print("Select 1. Earings, 2. Necklace, 3. Ring, 4. Eye glasses, 5. Watch ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				cloths = "Earings";
                                break;
                            }
                            else if(choice ==2){
                            	cloths = "Necklace";
                                break;
                            }
                            else if(choice == 3){
                            	cloths = "Ring";
                                break;
                            }
                            else if (choice ==4){
                            	cloths = "Eye glasses";
                                break;
                            }
                            else if (choice == 5){
                            	cloths = "Watch";
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String wpn = "";
                   	while (true) {
                   		System.out.print("Select 1. Balisong, 2. Sumpit, 3. Pangil ng Sigbin, 4. Machete, 5. Latigo ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				wpn = "Balisong";
                                break;
                            }
                            else if(choice ==2){
                            	wpn = "Sumpit";
                                break;
                            }
                            else if(choice == 3){
                            	wpn = "Pangil ng Sigbin";
                                break;
                            }
                            else if (choice ==4){
                            	wpn = "Machete";
                                break;
                            }
                            else if (choice == 5){
                            	wpn = "Latigo";
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	
                   	String armor = "";
                   	while (true) {
                   		System.out.print("Select 1. Kidlat Lightning Vanguard, 2. Bakunawa Scale Hauberk, 3. Carimanok Crested Helm, 4. Durian Gauntlets, 5. Datu's Valor Chestplate ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				armor = "Kidlat Lightning Vanguard";
                   				break;
                            }
                            else if(choice ==2){
                            	armor = "Bakunawa Scale Hauberk";
                            	break;
                            }
                            else if(choice == 3){
                            	armor = "Carimanok Crested Helm";
                            	break;
                            }
                            else if (choice ==4){
                            	armor = "Durian Gauntlets";
                            	break;
                            }
                            else if (choice == 5){
                            	armor = "The Man’s Feelings";
                            	break;
                            }
                   			}
                   		
              
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");sc.next();
                   	}              	              		
                   }
                   	
                   	String agimat = "";
                   	while (true) {
                   		System.out.print("Select 1. Tikbalang's Mane Clasp, 2. Tigmamanukan's Eye Gem, 3. Kapre's Cigar of Resilience, 4. Tikbalang's Hoof Talisman, 5. Pangil ng Syokoy ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				agimat = "Tikbalang's Mane Clasp";
                                break;
                            }
                            else if(choice ==2){
                            	agimat = "Tigmamanukan's Eye Gem";
                                break;
                            }
                            else if(choice == 3){
                            	agimat = "Kapre's Cigar of Resilience";
                                break;
                            }
                            else if (choice ==4){
                            	agimat = "Tikbalang's Hoof Talisman";
                                break;
                            }
                            else if (choice == 5){
                            	agimat = "Pangil ng Syokoy";
                                break;
                            }
                   			}
                 
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String passiveSkl = "";
                   	while (true) {
                   		System.out.print("Select 1. Kulam, 2. Hinun-anon(Whispering Secrets), 3. Salabat Surge, 4. Sumpa Sundo (Curse Reversal), 5. Tingog sa Kasinatian ");
                   		try {
                   			int choice = sc.nextInt();
                   		 if(choice == 1){
                   			passiveSkl = "Kulam";
                             break;
                         }
                         else if(choice ==2){
                        	 passiveSkl = "Hinun-anon(Whispering Secrets)";
                             break;
                         }
                         else if(choice == 3){
                        	 passiveSkl = "Salabat Surge";
                             break;
                         }
                         else if (choice ==4){
                        	 passiveSkl = "Sumpa Sundo (Curse Reversal)";
                             break;
                         }
                         else if (choice == 5){
                        	 passiveSkl = "Tingog sa Kasinatian";
                             break;
                         }
                   			}
                   		
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");sc.next();
                   	}              	              		
                   }
                   	
                   	
                   	duperClass luzon = new duperClass(gender,  status,  religion,  hobby,  persona, skin,  fcShape, mataKly,  hair,  hrKolor, bdyTyp,  height,  cloths,  accsrs, wpn, armor, agimat,  passiveSkl); 
                   	luzon.setStoryVISAYA();
                   	System.out.println("=======================================");
                    System.out.println("Chosen Ethnicity: Taga-Luzon");
                	System.out.println("---------------------------------------");
                   	luzon.gender();
                   	luzon.status();
                   	luzon.religion();
                   	luzon.hobby();
                   	luzon.persona();
                   	luzon.skin();
                   	luzon.fcShape();
                   	luzon.mataKly();
                   	luzon.hrStyle();
                   	luzon.hrKolor();
                   	luzon.bdyTyp();
                   	luzon.height();
                   	luzon.cloths();
                   	luzon.accsrs();
                   	luzon.wpn();
                   	luzon.armor();
                   	luzon.agimat();
                   	luzon.passiveSkl();
                   	break; 
                            	//visayas
                            	
                    }
                            else if (racism == 3){
                                duper.choiceNum("a", "b");

                            	String gender="";
                                while (true) {
                                	System.out.print("Select 1. Babai, 2. Lalaki, 3. Bayot, 4. Tomboy, 5. LGBT ");
                                	try {
                                	int choice = sc.nextInt();
                                	if (choice == 1){
                                		gender = "Babai";
                                		break;
                                    }
                                    else if (choice == 2){
                                    	gender = "Lalaki";
                                    	break;
                                    }
                                    else if (choice == 3){
                                    	gender = "Bayot";
                                    	break;
                                    }
                                    else if (choice == 4){
                                    	gender = "Tomboy";
                                    	break;
                                    }
                                    else if (choice == 5){
                                    	gender = "LGBT";
                                    	break;
                                    }}catch(InputMismatchException e) {
                            			System.out.println("Invalid Input...");
                            			sc.next();
                            		} 
                                }
                                String status="";
                    			while (true) {
                    				System.out.print("Select 1. Student, 2. Employee, 3. Tambay, 4. Breadwinner, 5. Beggar ");
                    				try {
                    				int choice = sc.nextInt();
                    				
                    					if (choice == 1){
                    	                    status = "Student";
                    	                    break;
                    	                }
                    	                else if (choice == 2){
                    	                    status = "Employee";
                    	                    break;
                    	                }
                    	                else if (choice == 3){
                    	                    status = "Tambay";
                    	                    break;
                    	                }
                    	                else if (choice == 4){
                    	                    status = "Breadwinner";
                    	                    break;
                    	                }
                    	                else if (choice == 5){
                    	                    status = "Beggar";
                    	                    break;
                    	                }}
                    				catch(InputMismatchException e) {
                    						System.out.println("Invalid Input...");
                    						sc.next();
                    				}              	              		
                    			}
                    			
                    String religion="";
                	while (true) {
                		System.out.print("Select 1. Catholic, 2. INC, 3. Christian, 4. Bornagain, 5. MCGI ");
                		try {
                		int choice = sc.nextInt();
                    if (choice == 1){
                    	religion = "Catholic";
                    	break;
                    }
                    else if (choice == 2){
                    	religion = "INC";
                    	break;
                    }
                    else if (choice == 3){
                    	religion = "Christian";
                    	break;
                    }
                    else if (choice == 4){
                    	religion = "Bornagain";
                    	break;
                    }
                    else if (choice == 5){
                    	religion = "MCGI";
                    	break;
                    }}
                		catch(InputMismatchException e) {
                			System.out.println("Invalid Input...");
                			sc.next();
                	}              	              		
                }
                    
                    String hobby = "";
                   	while (true) {
                   		System.out.print("Select 1. Gamer, 2. Magluto, 3. Mag drawing, 4. Kumanta, 5. Sumayaw ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                                hobby = "Gamer";
                                break;
                            }
                            else if(choice ==2){
                                hobby = "Magluto";
                                break;
                            }
                            else if(choice == 3){
                                hobby = "Mag drawing";
                                break;
                            }
                            else if (choice ==4){
                                hobby = "Kumanta";
                                break;
                            }
                            else if (choice == 5){
                                hobby = "Sumayaw";
                                break;
                            }}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String persona = "";
                   	while (true) {
                   		System.out.print("Select 1. Introvert, 2. Extrovert, 3. Omnivert, 4. Ambivert, 5. Pervert ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				persona= "Introvert";
                   				break;
                   			}
                            else if(choice ==2){
                            	persona = "Extrovert";
                            	break;
                            }
                            else if(choice == 3){
                            	persona= "Omnivert";
                            	break;
                            }
                            else if (choice ==4){
                            	persona= "Ambivert";
                            	break;
                            }
                            else if (choice == 5){
                            	persona = "Pervert";
                            	break;
                            }
                }
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                    
                   	String skin = "";
                   	while (true) {
                   		System.out.print("Select 1. kayumanggi, 2. Maitim, 3. Maputi, 4. Naninilaw, 5. Tan Gold ");
                   		try {
                   			int choice = sc.nextInt();
                   		 if(choice == 1){
                   			skin = "kayumanggi";
                   			break;
                         }
                         else if(choice ==2){
                        	 skin = "Maitim";
                        	 break;
                         }
                         else if(choice == 3){
                        	 skin = "Maputi";
                        	 break;
                         }
                         else if (choice ==4){
                        	 skin = "Naninilaw";
                        	 break;
                         }
                         else if (choice == 5){
                        	 skin = "Tan Gold";
                        	 break;
                         }}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String face = "";
                   	while (true) {
                   		System.out.print("Select 1. Bilugan, 2. Paiskwer, 3. Hababa, 4. Pa oblong, 5. Paheart ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                                face = "Bilugan";
                                break;
                            }
                            else if(choice ==2){
                                face = "Paiskwer";
                                break;
                            }
                            else if(choice == 3){
                                face = "Hababa";
                                break;
                            }
                            else if (choice == 4){
                                face = "Pa oblong";
                                break;
                            }
                            else if (choice == 5){
                                face = "Paheart";
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                    
                   	String eyes = "";
                   	while (true) {
                   		System.out.print("Select 1. Black, 2. Brown, 3. Blue, 4. Red, 5. Green ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				eyes = "Black";
                   				break;
                            }
                            else if(choice ==2){
                            	eyes =  "Brown";
                            	break;
                            }
                            else if(choice == 3){
                            	eyes =  "Blue";
                            	break;
                            }
                            else if (choice ==4){
                            	eyes =  "Red";
                            	break;
                            }
                            else if (choice == 5){
                                eyes =  "Green";
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                	String hair = "";
                   	while (true) {
                   		System.out.print("Select 1. Taper Fade, 2. Buzz Cut, 3. Under cut, 4. Dreadlocks, 5. Wally’s Cut ");
                   		try {
                   			int choice = sc.nextInt();
                   		 if(choice == 1){
                   			hair = "Taper Fade";
                   			break;
                         }
                         else if(choice ==2){
                        	 hair= "Buzz Cut";
                        	 break;
                         }
                         else if(choice == 3){
                        	 hair = "Under cut";
                        	 break;
                         }
                         else if (choice ==4){
                        	 hair = "Dreadlocks";
                        	 break;
                         }
                         else if (choice == 5){
                        	 hair = "Wally’s Cut";
                        	 break;
                         }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String fcShape = "";
                   	while (true) {
                   		System.out.print("Select 1. Bilugan, 2. Paiskwer, 3. Hababa, 4. Pa oblong, 5. Paheart ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				fcShape = "Bilugan";
                   				break;
                            }
                            else if(choice ==2){
                            	fcShape = "Paiskwer";
                            	break;
                            }
                            else if(choice == 3){
                            	fcShape = "Hababa";
                            	break;
                            }
                            else if (choice == 4){
                            	fcShape = "Pa oblong";
                            	break;
                            }
                            else if (choice == 5){
                            	fcShape = "Paheart";
                            	break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String mataKly = "";
                   	while (true) {
                   		System.out.print("Select 1. Black, 2. Brown, 3. Blue, 4. Red, 5. Green ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				mataKly = "Black";
                   				break;
                            }
                            else if(choice ==2){
                            	mataKly =  "Brown";
                            	break;
                            }
                            else if(choice == 3){
                            	mataKly =  "Blue";
                            	break;
                            }
                            else if (choice ==4){
                            	mataKly =  "Red";
                            	break;
                            }
                            else if (choice == 5){
                            	mataKly =  "Green";
                            	break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	
                   	String hrKolor = "";
                   	while (true) {
                   		System.out.print("Select 1. Black, 2. Blonde, 3. Ash Gray, 4. Red, 5. Orange ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				hrKolor = "Black";
                                break;
                            }
                            else if(choice ==2){
                            	hrKolor = "Blonde";
                                break;
                            }
                            else if(choice == 3){
                            	hrKolor = "Ash Gray";
                                break;
                            }
                            else if (choice ==4){
                            	hrKolor = "Red";
                                break;
                            }
                            else if (choice == 5){
                            	hrKolor = "Orange";
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String bdyTyp = "";
                   	while (true) {
                   		System.out.print("Select 1. Payatot, 2. Mataba, 3. Maskulado, 4. Gasul body, 5. Coca Cola body ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				bdyTyp = "Payatot";
                                break;
                            }
                            else if(choice ==2){
                            	bdyTyp = "Mataba";
                                break;
                            }
                            else if(choice == 3){
                            	bdyTyp = "Maskulado";
                                break;
                            }
                            else if (choice ==4){
                            	bdyTyp = "Gasul body";
                                break;
                            }
                            else if (choice == 5){
                            	bdyTyp = "Coca Cola body";
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	duper.choiceNum("a", "b", "c", "d");
                   	double height =0;
                   	while (true) {
                   		System.out.print("Select 1. 40%, 2. 70%, 3. 100%, 4. 120% ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				height = 40;
                                break;
                            }
                            else if(choice ==2){
                            	height =  70;
                                break;
                            }
                            else if(choice == 3){
                            	height =  100;
                                break;
                            }
                            else if (choice ==4){
                            	height =  120;
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	duper.choiceNum("a", "b", "c");
                   	String cloths = "";
                   	while (true) {
                   		System.out.print("Select 1. Y2K, 2. Sleepwear, 3. Old School, 4. Naka barong Tagalog, 5. Nakapang business suit ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				cloths = "Y2K";
                   				break;
                            }
                            else if(choice ==2){
                            	cloths = "Sleepwear";
                            	break;
                            }
                            else if(choice == 3){
                            	cloths = "Old School";
                            	break;
                            }
                            else if (choice ==4){
                            	cloths = "Naka barong Tagalog";
                            	break;
                            }
                            else if (choice == 5){
                            	cloths = "Nakapang business suit";
                            	break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String accsrs = "";
                   	while (true) {
                   		System.out.print("Select 1. Earings, 2. Necklace, 3. Ring, 4. Eye glasses, 5. Watch ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				cloths = "Earings";
                                break;
                            }
                            else if(choice ==2){
                            	cloths = "Necklace";
                                break;
                            }
                            else if(choice == 3){
                            	cloths = "Ring";
                                break;
                            }
                            else if (choice ==4){
                            	cloths = "Eye glasses";
                                break;
                            }
                            else if (choice == 5){
                            	cloths = "Watch";
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String wpn = "";
                   	while (true) {
                   		System.out.print("Select 1. Hanger, 2. Walis Tambo, 3. Tsinelas, 4. Balisong, 5. Batuta ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				wpn = "Hanger";
                                break;
                            }
                            else if(choice ==2){
                            	wpn = "Walis Tambo";
                                break;
                            }
                            else if(choice == 3){
                            	wpn = "Tsinelas";
                                break;
                            }
                            else if (choice ==4){
                            	wpn = "Balisong";
                                break;
                            }
                            else if (choice == 5){
                            	wpn = "Batuta";
                                break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	
                   	String armor = "";
                   	while (true) {
                   		System.out.println("Armor: ");
                        System.out.println("1.B'laan Spiritweave Cloak: A magical cloak made from enchanted weavings, providing both physical and spiritual protection.");
                        System.out.println("2.Maranao Sunforged Plate: Plate armor with a golden sheen, symbolizing the power of the sun and providing both physical and magical defense.");
                        System.out.println("3.Subanon Spiritcaller Robes: Mystical robes infused with the power of the spirits, providing magical protection, and enhancing the wearer's connection to the supernatural.");
                        System.out.println("4.Manobo Mountain Sentinel Plate: Sturdy plate armor inspired by mountainous landscapes, providing robust protection for frontline warriors.");
                        System.out.println("5.Bagobo Blaze Warden Attire: Fire-resistant armor adorned with symbols of flames, providing protection against heat-based attacks.");
                        
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				armor = ".B'laan Spiritweave Cloak";
                   				break;
                            }
                            else if(choice ==2){
                            	armor = "Maranao Sunforged Plate";
                            	break;
                            }
                            else if(choice == 3){
                            	armor = "Subanon Spiritcaller Robes";
                            	break;
                            }
                            else if (choice ==4){
                            	armor = "Manobo Mountain Sentinel Plate";
                            	break;
                            }
                            else if (choice == 5){
                            	armor = "Bagobo Blaze Warden Attire";
                            	break;
                            }
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");sc.next();
                   	}              	              		
                   }
                   	
                   	String agimat = "";
                   	while (true) {
                   		System.out.print("Select 1. Dead Soldier’s Fang, 2. Higaonon Moonlit Amulet, 3. Kampilan Valor Amulet, 4. Jamal’s Serenity Charm, 5. Maute Shadow Cloak ");
                   		try {
                   			int choice = sc.nextInt();
                   			if(choice == 1){
                   				agimat = "Dead Soldier’s Fang";
                                break;
                            }
                            else if(choice ==2){
                            	agimat = "Higaonon Moonlit Amulet";
                                break;
                            }
                            else if(choice == 3){
                            	agimat = "Kampilan Valor Amulet";
                                break;
                            }
                            else if (choice ==4){
                            	agimat = "Jamal’s Serenity Charm";
                                break;
                            }
                            else if (choice == 5){
                            	agimat = "Maute Shadow Cloak";
                                break;
                            }
             
                   			}
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");
                   			sc.next();
                   	}              	              		
                   }
                   	
                   	String passiveSkl = "";
                   	while (true) {
                   		System.out.print("1.Bagobo Mystic Drummer: Controls the battlefield with mystical drumbeats, influencing the flow of time or disrupting enemy abilities,");
                   		System.out.println("2.Hijab Conjurer: Summons protective veils that can deflect physical and magical attacks, inspired by the traditional Hijab worn with elegance");
                   		System.out.println("3.Sarangani Sandshaper: Manipulates sand and dust to create protective barriers, sandstorms for distraction, or constructs for offense.");
                        System.out.println("4.Tausug Tidecaller: Commands Ocean waves for strategic movements and attacks.");
                        System.out.println("5.Quantum Demolition Maestro: Can make and detonate any bombs for a seconds or minute");
                   		try {
                   			int choice = sc.nextInt();
                   		 if(choice == 1){
                   			passiveSkl = "Bagobo Mystic Drummer";
                             break;
                         }
                         else if(choice ==2){
                        	 passiveSkl = "Hijab Conjurer";
                             break;
                         }
                         else if(choice == 3){
                        	 passiveSkl = "Sarangani Sandshaper";
                             break;
                         }
                         else if (choice ==4){
                        	 passiveSkl = "Tausug Tidecaller";
                             break;
                         }
                         else if (choice == 5){
                        	 passiveSkl = "Quantum Demolition Maestro";
                             break;
                         }
                   			}
                   		
                   		catch(InputMismatchException e) {
                   			System.out.println("Invalid Input...");sc.next();
                   	}              	              		
                   }
                   	
                   	duperClass luzon = new duperClass(gender,  status,  religion,  hobby,  persona, skin,  fcShape, mataKly,  hair,  hrKolor, bdyTyp,  height,  cloths,  accsrs, wpn, armor, agimat,  passiveSkl); 
                   	luzon.setStoryMINDANAO();
                   	System.out.println("=======================================");
                    System.out.println("Chosen Ethnicity: Taga-Luzon");
                	System.out.println("---------------------------------------");
                   	luzon.gender();
                   	luzon.status();
                   	luzon.religion();
                   	luzon.hobby();
                   	luzon.persona();
                   	luzon.skin();
                   	luzon.fcShape();
                   	luzon.mataKly();
                   	luzon.hrStyle();
                   	luzon.hrKolor();
                   	luzon.bdyTyp();
                   	luzon.height();
                   	luzon.cloths();
                   	luzon.accsrs();
                   	luzon.wpn();
                   	luzon.armor();
                   	luzon.agimat();
                   	luzon.passiveSkl();
                   	break; 
    
                                	//mindanao
                    }
                    
                }catch(InputMismatchException e) {
               			System.out.println("Invalid Input...");
               			sc.next();
                   	}       
                }
               

    }

	}


    


