package hello;


import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface IPspRepositoryDynamoDB extends CrudRepository<Psp, String> {
}


