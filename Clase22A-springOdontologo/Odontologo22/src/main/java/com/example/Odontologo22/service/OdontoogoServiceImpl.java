package com.example.Odontologo22.service;

import com.example.Odontologo22.domain.Odontologo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service //Le indica a Spring que esto es un servicio
public class OdontoogoServiceImpl implements OdontologoService{
    @Override
    public List<Odontologo> listaOdontologos() {
        return Arrays.asList(new Odontologo("Javier"), new Odontologo("Ramon"));
    }
}
