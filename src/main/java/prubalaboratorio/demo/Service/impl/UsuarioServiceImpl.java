package prubalaboratorio.demo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import prubalaboratorio.demo.Component.UsuarioConverter;
import prubalaboratorio.demo.Entity.Usuario;
import prubalaboratorio.demo.Model.UsuarioModel;
import prubalaboratorio.demo.Repository.UsuarioRepository;
import prubalaboratorio.demo.Service.UsuarioService;

import java.util.List;

@Service("usuarioServiceImpl")
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    @Qualifier("usuarioRepository")
    UsuarioRepository usuarioRepository;

    @Autowired
    @Qualifier("usuarioConverter")
    UsuarioConverter usuarioConverter;



    @Override
    public UsuarioModel addUser(UsuarioModel usuarioModel) {
       List <Usuario> usuarios= usuarioRepository.findAll();
        return null;
    }

    @Override
    public List<UsuarioModel> listAllUsers() {


        return null;
    }

    @Override
    public Usuario findUsuarioByIdUsuario(int idUsuario) {
        return null;
    }

    @Override
    public void removerUsuario(int idUsuario) {

    }

    @Override
    public UsuarioModel findUserByIdUsuarioModel(int idUsuario) {
        return null;
    }
}
