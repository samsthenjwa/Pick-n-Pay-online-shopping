/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnp.backend.dao;

import com.pnp.backend.dto.catergory;
import java.util.List;

/**
 *
 * @author User
 */
public interface CatergoryDAO {

    catergory get(int id);

    List<catergory> list();

    boolean add(catergory catergory);

    boolean update(catergory catergory);

    boolean delete(catergory catergory);
}
