
package com.gestion.de.empleados.Gestion.de.empleados.Repository;

import com.gestion.de.empleados.Gestion.de.empleados.Modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    
}
