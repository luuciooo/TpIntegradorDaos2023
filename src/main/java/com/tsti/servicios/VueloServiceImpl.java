package com.tsti.servicios;

import com.tsti.accesoADatos.VueloDao;
import com.tsti.dto.VueloRequestDTO;
import com.tsti.entidades.Vuelo;
import com.tsti.exception.Excepcion;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VueloServiceImpl implements VueloService{
    @Autowired
    private VueloDao dao;


  private ModelMapper mapper = new ModelMapper();
    @Override
    public boolean saveVuelo(VueloRequestDTO DTO) throws Excepcion {
        boolean ret = false;
        if(!dao.existsById(DTO.getNumero_vuelo())){
            Vuelo vuelo = mapper.map(DTO, Vuelo.class);
            dao.save(vuelo);
            ret = true;
        }else{
            throw new Excepcion("Ya existe un vuelo para este numero de vuelo", 400);
        }
        return ret;
    }

    @Override
    public boolean updateVuelo(Long nro_vuelo, VueloRequestDTO DTO) throws Excepcion {
        if (dao.existsById(DTO.getNumero_vuelo())){
            Vuelo vuelo = mapper.map(DTO, Vuelo.class);
            dao.save(vuelo);
            return true;
        } throw new Excepcion("No existe un vuelo con este numero de vuelo", 400);

    }

    @Override
    public Vuelo getVuelo(Long numero_vuelo) throws Excepcion {
        Vuelo vuelo = dao.getById(numero_vuelo);
        if(vuelo == null)
            throw new Excepcion("No existe un vuelo con este numero de vuelo", 400);
        return vuelo;
    }

    @Override
    public List<Vuelo> getAllEntities() throws Excepcion {
        List<Vuelo> vuelos = dao.findAll();
        if(vuelos.isEmpty())
            throw new Excepcion("No existe ningun vuelo", 400);
        return null;
    }

    @Override
    public boolean deleteVuelo(Long numero_vuelo) throws Excepcion{
        boolean ret =false;
        Optional optionalVuelo = dao.findById(numero_vuelo);

        if (optionalVuelo.isPresent()) {

            Vuelo vuelo = (Vuelo)optionalVuelo.get();
            vuelo.setEstado("Cancelado");
            dao.delete(vuelo);
            ret= true;
        }else{
            throw new Excepcion("No existe un vuelo con este número", 400);
        }
        return ret;

    }

    @Override
    public boolean reprogramarVuelo(Long numero_vuelo, Date nuevaFecha, String nuevaHora) throws Excepcion{

        Optional<Vuelo> optionalVuelo = dao.findById(numero_vuelo);
        if (optionalVuelo.isPresent()) {
            Vuelo vuelo = optionalVuelo.get();
            vuelo.setFecha(nuevaFecha);
            vuelo.setHora(nuevaHora);
            vuelo.setEstado("reprogramado");
            dao.save(vuelo);
            return true;
        } else {
            throw new Excepcion("No existe un vuelo con este número de vuelo", 400);
        }

    }

}
