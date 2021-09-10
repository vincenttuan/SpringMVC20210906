# SpringMVC20210906
SpringMVC20210906

<pre>
解決中文問題
springmvc-servlet.xml 中加入
-------------------------------------------------------------------------------
	<!--  解決中文 -->
	<mvc:annotation-driven>
		<mvc:message-converters
			register-defaults="true">
			<bean
				class="org.springframework.http.converter.StringHttpMessageConverter">
				<property name="supportedMediaTypes">
					<list>
						<value>text/html;charset=UTF-8</value>
					</list>
				</property>
			</bean>
		</mvc:message-converters>
	</mvc:annotation-driven>
  -------------------------------------------------------------------------------
  </pre>
