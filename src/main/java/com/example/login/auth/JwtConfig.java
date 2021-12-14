package com.example.login.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.sercreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEAsa8gbKEebjPFVWWxuie5soN/5qm/h04astMtlakc4+mr7EVl\r\n" + 
			"DHXpSwZuieTpX15IE78/1HYNSgU72RHNWWiL60++ZuyBDnfSd+fDZMku7Z4BHpj7\r\n" + 
			"KlG68PGVnccYdZxTaknT/9jgBowN1dwMJ9SJeafz5t0jrnGTJHPGvYDnGISFRSLP\r\n" + 
			"AxU+cmPfM3sna3z/gO1hG9G9V2uVq2uJR0ylVjFkLEUyr3XUNfl3/y5VEfjvhgYI\r\n" + 
			"YSldq/D6ZQJLxsITmp5oJCxGLV6hyFpvQ0VKM6QhTN2LUL6ZmsXhphdNn2KT9LBH\r\n" + 
			"SBlQaHobEhyTze0QVV8OfXBedmIjCc1JQb+wIwIDAQABAoIBAAui8HisxJVrBo1l\r\n" + 
			"L5KFb3/lZMbybvypfM4hTmbywFWcxAmhMdDzF+g1759QQohgYFAKwl9jq9MhLJ42\r\n" + 
			"sEAevKsYedu7uWf9KOd5Yi6DjnM5WdFrK2fGGnwVFjtTAqMRLdVUKHIk/ebv3SgY\r\n" + 
			"VSN2o9o3yZ1g9ilCfuRwQJ/AhWHxj+hjVDPVAhxwFmBikp15e86182X/rceAm3OF\r\n" + 
			"5X1wbNwWxv2rY751XV7tPur+3ch06IRmE7WUoBzgljOOn8NHj74z5xTlzj985e7G\r\n" + 
			"ukIjuoiakHtvff2kdbSAGqFfcVaF6ZI3wP4hjIGO+TMdYoxvZPEBorDIfmdDnD5Z\r\n" + 
			"7lSpxAECgYEA2MvEnycos/FOuToTjh6YvEtQV2NG8kVGZ7uvUxjxd4GBe1LuXsjK\r\n" + 
			"cT4o+GajEWqrKhop5eUtvUOm3kYkeOpqG4OfC6rCW+nsVsLECzG9aocsXXAzlwUZ\r\n" + 
			"kPZqzwlf5vx/lWbb8HfaYywRQGk/4pQ9KfdKteJQ3kEVK8EN1AoPFqMCgYEA0dC8\r\n" + 
			"J1HzWBOuJqlsMQld3RWJ01OtKZlHmQ16TV0BGJDze8oqmwIKWlyUQ++FQNS2c4Je\r\n" + 
			"3zll7wzezWEkuTf//XjWfKKiv7ftFCrEYDMNcLZsP5FF5xsQ6ZGjalKhxEhFC+gs\r\n" + 
			"bGmA22U9B2OEy1xnhukFGEhiHTXlczsE2FBCGIECgYBKBroqxgpF9z20Tbpjqtro\r\n" + 
			"YKccT8/n5fO2dAXX0AqTjesSmyy9vL4zkNAYkaNYzR2JEMoBsBHAMJuIBldp2lFE\r\n" + 
			"99qU90fKbsO+lF6wm9lbyLBDb46OILWsJBgwfbj7fHhsIWU0ZRhzCJcTcVzZF1kT\r\n" + 
			"PVeLZ63JVlvORutb3dttFQKBgEYhsWKrP93G5kVCCEnzyY4mruUWaSEofQgpuyG0\r\n" + 
			"3rLpcJmGH+ukKPW/UEfM/guHjlzZzQBsXSgkcyzPNck7cLO2+mq6qg/PWM2O5gkJ\r\n" + 
			"x4pPT6uH0YfIQkTwS2E0saG8TmgGeSLbuRicpGOd3jtjba9ooC1XtIPzCfkUVzA+\r\n" + 
			"03kBAoGBALjHeLIbbFEQu3dOUEM2mgNWKunVAVLDCGlIWNcLKNy7UmaGrAaPFMHP\r\n" + 
			"t1wdLEtIY9VEo/6YB9Gxg0XghpmrOVT6J2SZBMkcKa03tURyE4gw8mrTdbvdoGoi\r\n" + 
			"oti6Cewu8hQFgJRACuUaIuqK7wwwFe9e91Tb1RS+CoSRcgK4nEix\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsa8gbKEebjPFVWWxuie5\r\n" + 
			"soN/5qm/h04astMtlakc4+mr7EVlDHXpSwZuieTpX15IE78/1HYNSgU72RHNWWiL\r\n" + 
			"60++ZuyBDnfSd+fDZMku7Z4BHpj7KlG68PGVnccYdZxTaknT/9jgBowN1dwMJ9SJ\r\n" + 
			"eafz5t0jrnGTJHPGvYDnGISFRSLPAxU+cmPfM3sna3z/gO1hG9G9V2uVq2uJR0yl\r\n" + 
			"VjFkLEUyr3XUNfl3/y5VEfjvhgYIYSldq/D6ZQJLxsITmp5oJCxGLV6hyFpvQ0VK\r\n" + 
			"M6QhTN2LUL6ZmsXhphdNn2KT9LBHSBlQaHobEhyTze0QVV8OfXBedmIjCc1JQb+w\r\n" + 
			"IwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";

}
