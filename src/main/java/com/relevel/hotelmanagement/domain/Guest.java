package com.relevel.hotelmanagement.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class Guest {
    
    @Id
    private long guestId;
}
