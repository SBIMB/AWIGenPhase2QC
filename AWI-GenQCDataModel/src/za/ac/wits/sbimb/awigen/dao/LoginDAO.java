/**
 * 
 */
package za.ac.wits.sbimb.awigen.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import za.ac.wits.sbimb.awigen.entity.User;

/**
 * @author Freedom Mukomana
 *
 */
@Repository
public class LoginDAO extends HibernateSessionDAO{
	public boolean validate(String username, String pass) {        
        boolean status = false;
               
        Criteria criteria = session.createCriteria(User.class);  
        criteria.add(Restrictions.eq("username", username));
        if(criteria.uniqueResult()==null)
        	status=Boolean.TRUE;
        return status;
    }
}
