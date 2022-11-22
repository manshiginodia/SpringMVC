package com.nri.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.nri.model.Reservation;

public class ReservationDaoImpl implements ReservationDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	int result;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public int rcrInsert(Reservation robj) {
		result= (Integer)this.hibernateTemplate.save(robj);
		return result;
	}

	
	@Override
	@Transactional
	public void rcrUpdate(Reservation robj) {
		this.hibernateTemplate.update(robj);
		
	}

	@Override
	@Transactional
	public void rcrDelete(int pid) {
		Reservation r= this.hibernateTemplate.get(Reservation.class, pid);
		this.hibernateTemplate.delete(r);
	}

	@Override
	public Reservation rcrSearchByPid(int pid) {
		Reservation r= this.hibernateTemplate.get(Reservation.class, pid);
		return r;
	}

	@Override
	public List<Reservation> rcrAllBooking() {
		List<Reservation> listobj = this.hibernateTemplate.loadAll(Reservation.class);
		return listobj;
	}
}
