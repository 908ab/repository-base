package miyakawa.tool.repository.base;

import miyakawa.tool.repository.exception.DomainNotFoundException;
import java.util.List;

public interface RepositoryInterface<Domain> {
    Long insertOne(Domain domain);
    void insertMany(List<Domain> domainList);
    Domain findById(Long id) throws DomainNotFoundException;
    List<Domain> findAll();
    Long countAll();
    void updateById(Long id, Domain domain);
    void deleteById(Long id);
}
