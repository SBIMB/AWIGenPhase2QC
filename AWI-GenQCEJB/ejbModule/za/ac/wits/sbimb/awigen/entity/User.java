/**
 * 
 */
package za.ac.wits.sbimb.awigen.entity;

import javax.persistence.Column;

/**
 * @author Freedom Mukomana
 *
 */
public class User {
	private String username;
	private String password;
	
	/**
	 * @return the username
	 */
	@Column
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	@Column
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
