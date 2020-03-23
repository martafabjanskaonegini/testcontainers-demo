## General

- [ ] All acceptance criteria are met
- [ ] Manual tests with appropriate scenarios are conducted
- [ ] Application works with docker and local docker-compose with proper core version
- [ ] Changes are backward compatible (if needed)
- [ ] Documentation is added/updated (configuration, release notes, upgrade instructions, topic guides)

## Backend

- [ ] No code duplication throughout the project if possible
- [ ] Methods/classes are as concise as possible (pay attention especially in case of modified blocks of code)
- [ ] Clean code is preserved check output from sonarcloud analyse
- [ ] Security concerns are verified based on defined list
- [ ] Unit tests contain happy paths and corner cases flows
- [ ] All important events are logged on proper level based on engineering guide.
- [ ] No personal data is logged (email, phone, external customer identifier ...)

## Frontend

- [ ] Beans are not called directly from the Thymeleaf template
- [ ] Clean code is preserved
- [ ] Security concerns are verified based on defined list
- [ ] Ensure that ABEM / BEM rules are preserved (for new projects)