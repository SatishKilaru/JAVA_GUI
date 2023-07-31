package awt;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Employee {
	private String name, number, job, salary;

	public Employee(String name, String number, String job, String salary) {
		this.name = name;
		this.number = number;
		this.job = job;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
}
class Position{
	int pos;
	Position(int pos){
		this.pos=pos;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
}
public class EmployeeFramework {
	static String buton="Normal";
	public static void setbuton(String sat){
		buton=sat;
	}
	public static boolean isIntValid(String str){
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	public static boolean isStringValid(String str) {
	    return str.matches("[a-zA-Z]+");
	}
	public static void main(String[] args) throws IOException { 
		Frame f;
		Label l1;
		Label l2;
		Label l3;
		Label l4,l5;
		Choice c;
		TextField t1, t2, t3,t4; 
		Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
		f=new Frame("EmployeeFramework");
		l1=new Label("Name");
		l2=new Label("Number");
		l3=new Label("Job");
		l4=new Label("Salary");
		l5=new Label("Role");
		c=new Choice();
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		b1=new Button("First");
		b2=new Button("Next");
		b3=new Button("Prev");
		b4=new Button("Last");
		b5=new Button("Add");
		b6=new Button("Edit");
		b7=new Button("Del");
		b8=new Button("Save");
		b9=new Button("Search");
		b10=new Button("Clear");
		b11=new Button("exit");
		l1.setBounds(80, 100, 50, 30);    
		l2.setBounds(80, 150, 50, 30); 
		l3.setBounds(80, 200, 50, 30);    
		l4.setBounds(80, 250, 50, 30);
		l5.setBounds(290, 250, 50, 30);
		t1.setBounds(150, 100, 100, 30);    
		t2.setBounds(150, 150, 100, 30); 
		t3.setBounds(150, 200, 100, 30);    
		t4.setBounds(150, 250, 100, 30); 
		c.setBounds(350, 250, 100, 30);   
		b1.setBounds(100, 350, 50, 30);  
		b2.setBounds(200, 350, 50, 30); 
		b3.setBounds(300, 350, 50, 30);  
		b4.setBounds(400, 350, 50, 30);  
		b5.setBounds(100, 400, 50, 30);  
		b6.setBounds(200, 400, 50, 30);  
		b7.setBounds(300, 400, 50, 30);  
		b8.setBounds(400, 400, 50, 30);  
		b9.setBounds(100, 450, 50, 30);  
		b10.setBounds(200, 450, 50, 30);  
		b11.setBounds(300, 450, 50, 30);   
		b1.setBackground(Color.BLUE);
		b2.setBackground(Color.BLUE);
		b3.setBackground(Color.BLUE);
		b4.setBackground(Color.BLUE);
		b5.setBackground(Color.BLUE);
		b6.setBackground(Color.BLUE);
		b7.setBackground(Color.BLUE);
		b8.setBackground(Color.BLUE);
		b9.setBackground(Color.BLUE);
		b10.setBackground(Color.BLUE);
		b11.setBackground(Color.BLUE);
		l1.setBackground(Color.yellow);
		l2.setBackground(Color.yellow);
		l3.setBackground(Color.yellow);
		l4.setBackground(Color.yellow);
		l5.setBackground(Color.yellow);
		f.setBackground(Color.CYAN);
		t1.setBackground(Color.GREEN);
		t2.setBackground(Color.GREEN);
		t3.setBackground(Color.GREEN);
		t4.setBackground(Color.GREEN);
		c.setBackground(Color.GREEN);
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		b5.setForeground(Color.WHITE);
		b6.setForeground(Color.WHITE);
		b7.setForeground(Color.WHITE);
		b8.setForeground(Color.WHITE);
		b9.setForeground(Color.WHITE);
		b10.setForeground(Color.WHITE);
		b11.setForeground(Color.WHITE);
		f.setTitle("Employee Details");
		Label heading = new Label("Employee Details");
		heading.setBounds(180, 50, 160, 30);
		heading.setFont(new Font("Arial", Font.BOLD, 18));
		f.add(heading);
		c.add("View Mode");
		c.add("Edit Mode");
		c.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        String selectedOption = c.getSelectedItem();

		        if (selectedOption.equals("Edit Mode")) {
		            t1.setEnabled(true);
		            b1.setEnabled(true);
		        } else if (selectedOption.equals("View Mode")) {
		            t1.setEnabled(false);
		            b1.setEnabled(false);
		        }
		    }
		});
		f.add(l1);  
		f.add(l2); 
		f.add(l3);  
		f.add(l4);  
		f.add(l5);
		f.add(t1);  
		f.add(t2); 
		f.add(t3);  
		f.add(t4); 
		f.add(b1); 
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(c); 
		f.setSize(500, 500);    
		f.setLayout(null);    
		f.setVisible(true);  
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				f.dispose();
			}
		});
		File file=new File("C:\\\\Users\\\\Kilaru Satish\\\\OneDrive\\\\Documents\\\\Emp.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<Employee> arr=new ArrayList<>();
		String str;
		while ((str = br.readLine()) != null) {
		    Employee emp = new Employee("", "", "", "");
		    StringTokenizer st = new StringTokenizer(str, ",");
		    if (st.hasMoreTokens()) {
		        emp.setName(st.nextToken().trim());
		    }
		    if (st.hasMoreTokens()) {
		        emp.setNumber(st.nextToken().trim());
		    }
		    if (st.hasMoreTokens()) {
		        emp.setJob(st.nextToken().trim());
		    }
		    if (st.hasMoreTokens()) {
		        emp.setSalary(st.nextToken().trim());
		    }
		    arr.add(emp);
		}
		int cur=0;
		Position p=new Position(cur);
		if(arr.size()>0) {
			System.out.println(arr.size());
			t1.setText(arr.get(0).getName());
			t2.setText(arr.get(0).getNumber()); 
			t3.setText(arr.get(0).getJob());
			t4.setText(arr.get(0).getSalary());
		}
		//First Button
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(arr.size()>0) {
					t1.setText(arr.get(0).getName());
					t2.setText(arr.get(0).getNumber()); 
					t3.setText(arr.get(0).getJob());
					t4.setText(arr.get(0).getSalary());
				}
				p.setPos(0);
			}
		});
		//Last Button
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int cur=arr.size()-1;
				if(cur>0) {
					t1.setText(arr.get(cur).getName());
					t2.setText(arr.get(cur).getNumber()); 
					t3.setText(arr.get(cur).getJob());
					t4.setText(arr.get(cur).getSalary());
					p.setPos(cur);
				}
			}
		});
		//Exit Button
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				f.dispose();
			}
		});
		//Next Button
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int cur=p.getPos()+1;
				if(arr.size()>cur) {
					t1.setText(arr.get(cur).getName());
					t2.setText(arr.get(cur).getNumber()); 
					t3.setText(arr.get(cur).getJob());
					t4.setText(arr.get(cur).getSalary());
					p.setPos(cur);
				}else {
					JOptionPane.showMessageDialog(f,"You are in Last Position");
				}
			}});
		//Previous Button
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int cur=p.getPos()-1;
				if(cur>=0) {
					t1.setText(arr.get(cur).getName());
					t2.setText(arr.get(cur).getNumber()); 
					t3.setText(arr.get(cur).getJob());
					t4.setText(arr.get(cur).getSalary());
					p.setPos(cur);
				}else {
					JOptionPane.showMessageDialog(f,"You are in First Position");
				}
			}});
		//Clear Button
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				t1.setText("");
				t2.setText(""); 
				t3.setText("");
				t4.setText("");
			}});
		//Delete Button
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String selectedOption = c.getSelectedItem();
				if (!selectedOption.equals("Edit Mode")) {
			    	JOptionPane.showMessageDialog(f, "You are in View Mode");
			    	return ;
			    }
				EmployeeFramework.setbuton("Del");
			}});
		//Add Button
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String selectedOption = c.getSelectedItem();
			    if (!selectedOption.equals("Edit Mode")) {
			    	JOptionPane.showMessageDialog(f, "You are in View Mode");
			    	return;
			    }
				t1.setText("");
				t2.setText(""); 
				t3.setText("");
				t4.setText("");
				EmployeeFramework.setbuton("Add");
			}});
		//Edit Button
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String selectedOption = c.getSelectedItem();
				if (!selectedOption.equals("Edit Mode")) {
			    	JOptionPane.showMessageDialog(f, "You are in View Mode");
			    	return ;
			    }
				EmployeeFramework.setbuton("Edit");
			}});

		//Save Button
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(buton.equals("Add")) {
				   
					Employee e=new Employee("","","","");
					e.setName(t1.getText());
					e.setNumber(t2.getText());
					e.setJob(t3.getText());
					e.setSalary(t4.getText());
					if (isStringValid(e.getName()) && isIntValid(e.getNumber()) && isStringValid(e.getJob()) && isIntValid(e.getSalary())) {
		                arr.add(e);
		            } else {
		                JOptionPane.showMessageDialog(f, "Invalid input! Please enter correct values.");
		            }
					EmployeeFramework.setbuton("Normal");
				}
				else if(buton.equals("Edit")) {
					int cur=p.getPos();
					Employee e=new Employee("","","","");
					e.setName(t1.getText());
					e.setNumber(t2.getText());
					e.setJob(t3.getText());
					e.setSalary(t4.getText());
					if (isStringValid(e.getName()) && isIntValid(e.getNumber()) && isStringValid(e.getJob()) && isIntValid(e.getSalary())) {
		                arr.set(cur, e);
		            } else {
		                JOptionPane.showMessageDialog(f, "Invalid input! Please enter correct values.");
		            }
					EmployeeFramework.setbuton("Normal");
				}
				else if(buton.equals("Del")) {
					int cur=p.getPos();
					arr.remove(cur);
					t1.setText("");
					t2.setText(""); 
					t3.setText("");
					t4.setText("");
					EmployeeFramework.setbuton("Normal");
				}
				else{
					JOptionPane.showMessageDialog(f,"Already Saved");
				}
				try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
		            for (Employee employee : arr) {
		                String employeeData = employee.getName() + "," + employee.getNumber() + ","
		                        + employee.getJob() + "," + employee.getSalary();

		                writer.write(employeeData);
		                writer.newLine();
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			}});
		//Search Button
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Employee se=null;
				if((t1.getText().length())>0) {
					for(Employee emp:arr) {
						if(emp.getName().equals(t1.getText())) {
							se=emp;
						}
					}
					if(se==null)
						JOptionPane.showMessageDialog(f,"No Employee found");
				}
				else if((t2.getText().length())>0) {
					for(Employee emp:arr) {
						if(emp.getNumber().equals(t2.getText())) {
							se=emp;
						}
					}
					if(se==null)
						JOptionPane.showMessageDialog(f,"No Employee found");
				}
				else if((t3.getText().length())>0) {
					for(Employee emp:arr) {
						if(emp.getJob().equals(t3.getText())) {
							se=emp;
						}
					}
					if(se==null)
						JOptionPane.showMessageDialog(f,"No Employee found");
				}
				else if((t4.getText().length())>0) {
					for(Employee emp:arr) {
						if(emp.getJob().equals(t4.getText())) {
							se=emp;
						}
					}
					if(se==null)
						JOptionPane.showMessageDialog(f,"No Employee found");
				}
				t1.setText(se.getName());
				t2.setText(se.getNumber()); 
				t3.setText(se.getJob());
				t4.setText(se.getSalary());
			}});
	}
}
