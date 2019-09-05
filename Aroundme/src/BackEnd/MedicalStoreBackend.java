package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MedicalStoreBackend {

	Statement stmt;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	JTextField t1, t2, t3, desc;
	JFrame frame;
	JButton b1, bt1, bt2, bt3, bt4, pb1, pb2, pb3, but1, but2, but3;

	public void DatabaseConnect() {
		// Step 1 :- Driver Load
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step 2 :- Establish connectivity
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/aroundme", "root", "root");

			// Step 3 :- we need object of Statement as a messenger

			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

			// Step 4:- Create a query

			String msg = "SELECT * FROM medicalstores";
			rs = stmt.executeQuery(msg);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void FillTextBox(JTextField t1, JTextField t2, JTextField t3, JTextField desc) {
		try {
			t1.setText(rs.getString("Name"));
			t2.setText(rs.getString("Address"));
			t3.setText(rs.getString("standard"));
			desc.setText(rs.getString("description"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void rcrNext(JTextField t1, JTextField t2, JTextField t3, JTextField desc) {
		// TODO Auto-generated method stub

		try {
			if (rs.next()) {
				FillTextBox(t1, t2, t3, desc);
			} else {
				JOptionPane.showMessageDialog(frame, "Sir you are at last record ");
				rs.previous();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void rcrprev(JTextField t1, JTextField t2, JTextField t3, JTextField desc) {
		// TODO Auto-generated method stub
		try {
			if (rs.previous()) {
				FillTextBox(t1, t2, t3, desc);
			} else {
				JOptionPane.showMessageDialog(frame, "You are already on the first record ");
				rs.next();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void rcrFirst(JTextField t1, JTextField t2, JTextField t3, JTextField desc) {
		// TODO Auto-generated method stub
		try {
			rs.first();
			FillTextBox(t1, t2, t3, desc);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void rcrLast(JTextField t1, JTextField t2, JTextField t3, JTextField desc) {
		// TODO Auto-generated method stub
		try {
			rs.last();
			FillTextBox(t1, t2, t3, desc);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void rcrInsert(JFrame frame, JTextField t1, JTextField t2, JTextField t3, JTextField desc) {
		// TODO Auto-generated method stub

		String dname = t1.getText();
		String daddress = t2.getText();
		String dstandard = t3.getText();
		String ddesc = desc.getText();

		String sql = "INSERT into medicalstores" + " (Name, Address, standard, description)" + "VALUES (?, ?, ?, ?)";

		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, dname);
			pstmt.setString(2, daddress);
			pstmt.setString(3, dstandard);
			pstmt.setString(4, ddesc);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(frame,"Inserted Sucess");

	}

	public void rcrUpdate(JFrame frame, JTextField t1, JTextField t2, JTextField t3, JTextField desc) {
		// TODO Auto-generated method stub

		String dname = t1.getText();
		String daddress = t2.getText();
		String dstandard = t3.getText();
		String ddesc = desc.getText();

		String sqlUpdate = "UPDATE medicalstores " + "SET Address =? , standard =?,description =?" + "WHERE Name =?";

		try {
			pstmt = con.prepareStatement(sqlUpdate);

			pstmt.setString(1, daddress);
			pstmt.setString(2, dstandard);
			pstmt.setString(3, ddesc);
			pstmt.setString(4, dname);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(frame,"Updated Sucess");

	}

	public void rcrDelete(JFrame frame, JTextField t1, JTextField t2, JTextField t3, JTextField desc) {
		// TODO Auto-generated method stub
		
		try {
			rs.deleteRow();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(frame,"Deleted Sucess");
	
	}
	public void rcrSearch(JFrame frame, JTextField t1, JTextField t2, JTextField t3, JTextField desc, JTextField txt1) {
		// TODO Auto-generated method stub

		if (txt1.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(frame, "We need name to start journey ");
		} else {
			String n = txt1.getText();

			String msg = "select * from medicalstores where Name = ?";

			try {
				pstmt = con.prepareStatement(msg);
				pstmt.setString(1, n);

				rs = pstmt.executeQuery();

				if (rs.next()) {
					FillTextBox(t1, t2, t3, desc);
				} else {
					JOptionPane.showMessageDialog(frame, n + " Not in our database ");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void rcrClear(JFrame frame, JTextField t1, JTextField t2, JTextField t3, JTextField desc) {
		// TODO Auto-generated method stub
		t1.setText(" ");
		t2.setText(" ");
		t3.setText(" ");
		desc.setText(" ");

	}

}