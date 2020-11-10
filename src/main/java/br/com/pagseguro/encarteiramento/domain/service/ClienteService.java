package br.com.pagseguro.encarteiramento.domain.service;

import br.com.pagseguro.encarteiramento.domain.dto.ClienteDto;
import br.com.pagseguro.encarteiramento.domain.model.Cliente;
import br.com.pagseguro.encarteiramento.domain.repository.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional
    public ClienteDto save(ClienteDto clienteParam) {
        Cliente cliente = mapperToEntity(clienteParam);
        cliente = clienteRepository.save(cliente);
        return mapperToDto(cliente);
    }

    @Transactional
    public ClienteDto findById(Long clientId) {
        ClienteDto exit = null;
        Optional<Cliente> model = clienteRepository.findById(clientId);
        if (model.isPresent()) {
            exit = mapperToDto(model.get());
        }
        return exit;
    }

    @Transactional
    public Boolean deleteById(Long clientId) {
        Boolean saida = Boolean.FALSE;
        clienteRepository.deleteById(clientId);
        saida = Boolean.TRUE;
        return saida;
    }

    @Transactional
    public ClienteDto update(ClienteDto clienteParam) {
        ClienteDto ext = null;
        Optional<Cliente> cli = clienteRepository.findById(clienteParam.getId());
        if (cli.isPresent()) {
            ext = mapperToDto(cli.get());
        }
        return ext;

    }

    private Cliente mapperToEntity(ClienteDto clienteDto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(clienteDto, Cliente.class);
    }

    private ClienteDto mapperToDto(Cliente cliente) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(cliente, ClienteDto.class);
    }

}