package br.com.lucas.ApiRestFull.Repositories;


import br.com.lucas.ApiRestFull.Models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

}
