
package com.tupuntodeventa.bl.Usuario;

import java.util.ArrayList;


public interface IUsuarioDao {
    public void insertar (Usuario usuario)throws Exception;
    public ArrayList <Usuario> listar ()throws Exception;

    
}
