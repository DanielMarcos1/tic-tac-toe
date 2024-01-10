package com.tictactoe.tictactoe.services;

import com.tictactoe.tictactoe.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tictactoe.tictactoe.repositories.RoleRepository;
import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    // Creates a new role
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    // This method is self-explanatory, it finds the Role by its id or null if it doesn't exist.
    public Role getRoleById(String id) {
        return roleRepository.findById(id).orElse(null);
    }

    // Come on man do I really need to comment this?
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    // Updates an existing role in a database
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    public void deleteRole(String id) {
        roleRepository.deleteById(id);
    }
}
