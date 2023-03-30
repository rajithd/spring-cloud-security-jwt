import * as cdk from 'aws-cdk-lib';
import { Repository } from 'aws-cdk-lib/aws-ecr';
import { Construct } from 'constructs';

export class EcrStack extends cdk.Stack {
  constructor(scope: Construct, id: string, props?: cdk.StackProps) {
    super(scope, id, props);

    new Repository(this, 'gateway-service', {
      repositoryName: 'spring-cloud-security-jwt-gateway-service'
    });

    new Repository(this, 'config-service', {
      repositoryName: 'spring-cloud-security-jwt-config-service'
    });

    new Repository(this, 'discovery-service', {
      repositoryName: 'spring-cloud-security-jwt-discovery-service'
    });

    new Repository(this, 'cars-service', {
      repositoryName: 'spring-cloud-security-jwt-cars-service'
    });

    new Repository(this, 'auth-service', {
      repositoryName: 'spring-cloud-security-jwt-auth-service'
    });
  }
}
