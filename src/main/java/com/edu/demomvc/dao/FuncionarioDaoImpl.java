package com.edu.demomvc.dao;

import com.edu.demomvc.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements  FuncionarioDao{
}
