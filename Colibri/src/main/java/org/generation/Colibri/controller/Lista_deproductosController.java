package org.generation.Colibri.controller;

import org.generation.Colibri.model.Lista_deproductos;
import org.generation.Colibri.service.Lista_deproductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/Lista_deproductos/")
public class Lista_deproductosController {
    private final Lista_deproductosService lista_deproductosService;

    @Autowired
    public Lista_deproductosController(Lista_deproductosService lista_deproductosService) {
        this.lista_deproductosService = lista_deproductosService;
    }

    @GetMapping
    public List<Lista_deproductos> getAllLista_deproductos() {
        return lista_deproductosService.getAllLista_deproductos();
    }

    @GetMapping(path = "{prodId}")
    public List<Lista_deproductos> getLista_deproductos(@PathVariable("prodId") Long id) {
        return Lista_deproductosService.getAllLista_deproductos();
    }

    @DeleteMapping(path = "{prodId}")
    public Lista_deproductos deleteLista_deproductos(@PathVariable("prodId") Long id) {
        return lista_deproductosService.deleteLista_deproductos(id);
    }

    @PostMapping
    public Lista_deproductos addLista_deproductos(@RequestBody Lista_deproductos lista_deproductos) {
        return lista_deproductosService.addLista_deproductos (lista_deproductos);
    }

    @PutMapping(path = "{prodId}")
    public Lista_deproductos updateLista_deproductos(@PathVariable("prodId") Long id,
                                                     @RequestBody Lista_deproductos lista_deproductos) {
        return lista_deproductosService.updatelista_deproductos(id, lista_deproductos);
    }
}
