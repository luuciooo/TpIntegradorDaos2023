package com.tsti.servicios;

import com.tsti.accesoADatos.ClienteDao;
import com.tsti.dto.ClienteRequestDTO;
import com.tsti.entidades.Cliente;
import com.tsti.exception.Excepcion;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteDao dao;

    @Autowired
    private ModelMapper mapper;
    @Override
    public Long saveCliente(ClienteRequestDTO DTO) throws Excepcion {
        if(!dao.existsById(DTO.getDni())){
            Cliente cliente = mapper.map(DTO, Cliente.class);
            dao.save(cliente);
            return DTO.getDni();
        }
        throw new Excepcion("Ya existe un cliente con se DNI", 400);
    }

    @Override
    public Long updateCliente(ClienteRequestDTO DTO) throws Excepcion {
       if (dao.existsById(DTO.getDni())){
           Cliente cliente = mapper.map(DTO, Cliente.class);
           dao.save(cliente);
           return DTO.getDni();
       }
       throw new Excepcion("No existe un cliente con se DNI", 400);
    }

    @Override
    public Cliente getCliente(Long id) throws Excepcion {
        Cliente cliente = dao.getById(id);
        if(cliente == null)
            throw new Excepcion("No existe un cliente con se DNI", 400);
        return cliente;
    }

    @Override
    public List<Cliente> getAllClientes() throws Excepcion {
        List<Cliente> clientes = dao.findAll();
        if(clientes.isEmpty())
            throw new Excepcion("No existe ningun cliente", 400);
        return null;
    }

    @Override
    public Long deleteCliente(Long id) throws Excepcion {
        if (dao.existsById(id)){
            dao.deleteById(id);
            return id;
        }
        throw new Excepcion("No existe un cliente con se DNI", 400);
    }
}
