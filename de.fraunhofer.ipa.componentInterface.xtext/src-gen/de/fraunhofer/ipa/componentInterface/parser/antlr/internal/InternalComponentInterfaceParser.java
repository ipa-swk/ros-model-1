package de.fraunhofer.ipa.componentInterface.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.componentInterface.services.ComponentInterfaceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentInterfaceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'name'", "'namespace'", "'publisher'", "'subscriber'", "'serviceServer'", "'serviceClient'", "'}'", "'GraphName'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'Publisher'", "'TopicName'", "'TopicRef'", "'NameSpace'", "'Subscriber'", "'MessageDefinition'", "'ServiceServer'", "'ServiceName'", "'SrvRef'", "'ServiceClient'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalComponentInterfaceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentInterfaceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentInterfaceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentInterface.g"; }



     	private ComponentInterfaceGrammarAccess grammarAccess;

        public InternalComponentInterfaceParser(TokenStream input, ComponentInterfaceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentInterface";
       	}

       	@Override
       	protected ComponentInterfaceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentInterface"
    // InternalComponentInterface.g:64:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalComponentInterface.g:64:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalComponentInterface.g:65:2: iv_ruleComponentInterface= ruleComponentInterface EOF
            {
             newCompositeNode(grammarAccess.getComponentInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInterface=ruleComponentInterface();

            state._fsp--;

             current =iv_ruleComponentInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentInterface"


    // $ANTLR start "ruleComponentInterface"
    // InternalComponentInterface.g:71:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) ) )? (otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) ) )? (otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) ) )? (otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_5_0 = null;

        EObject lv_RosTopicPublisher_7_0 = null;

        EObject lv_RosTopicSubscriber_9_0 = null;

        EObject lv_RosServiceServer_11_0 = null;

        EObject lv_RosServiceClient_13_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:77:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) ) )? (otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) ) )? (otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) ) )? (otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) ) )? otherlv_14= '}' ) )
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) ) )? (otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) ) )? (otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) ) )? (otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) ) )? otherlv_14= '}' )
            {
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) ) )? (otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) ) )? (otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) ) )? (otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) ) )? otherlv_14= '}' )
            // InternalComponentInterface.g:79:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) ) )? (otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) ) )? (otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) ) )? (otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getNameKeyword_2());
            		
            // InternalComponentInterface.g:91:3: ( (lv_name_3_0= ruleEString ) )
            // InternalComponentInterface.g:92:4: (lv_name_3_0= ruleEString )
            {
            // InternalComponentInterface.g:92:4: (lv_name_3_0= ruleEString )
            // InternalComponentInterface.g:93:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentInterface.g:110:3: (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentInterface.g:111:4: otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getNamespaceKeyword_4_0());
                    			
                    // InternalComponentInterface.g:115:4: ( (lv_namespace_5_0= ruleNamespace ) )
                    // InternalComponentInterface.g:116:5: (lv_namespace_5_0= ruleNamespace )
                    {
                    // InternalComponentInterface.g:116:5: (lv_namespace_5_0= ruleNamespace )
                    // InternalComponentInterface.g:117:6: lv_namespace_5_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNamespaceNamespaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_namespace_5_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:135:3: (otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentInterface.g:136:4: otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentInterfaceAccess().getPublisherKeyword_5_0());
                    			
                    // InternalComponentInterface.g:140:4: ( (lv_RosTopicPublisher_7_0= rulePublisher ) )
                    // InternalComponentInterface.g:141:5: (lv_RosTopicPublisher_7_0= rulePublisher )
                    {
                    // InternalComponentInterface.g:141:5: (lv_RosTopicPublisher_7_0= rulePublisher )
                    // InternalComponentInterface.g:142:6: lv_RosTopicPublisher_7_0= rulePublisher
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherPublisherParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_RosTopicPublisher_7_0=rulePublisher();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"RosTopicPublisher",
                    							lv_RosTopicPublisher_7_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.Publisher");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:160:3: (otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:161:4: otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponentInterfaceAccess().getSubscriberKeyword_6_0());
                    			
                    // InternalComponentInterface.g:165:4: ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) )
                    // InternalComponentInterface.g:166:5: (lv_RosTopicSubscriber_9_0= ruleSubscriber )
                    {
                    // InternalComponentInterface.g:166:5: (lv_RosTopicSubscriber_9_0= ruleSubscriber )
                    // InternalComponentInterface.g:167:6: lv_RosTopicSubscriber_9_0= ruleSubscriber
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberSubscriberParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_RosTopicSubscriber_9_0=ruleSubscriber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"RosTopicSubscriber",
                    							lv_RosTopicSubscriber_9_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.Subscriber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:185:3: (otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentInterface.g:186:4: otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) )
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentInterfaceAccess().getServiceServerKeyword_7_0());
                    			
                    // InternalComponentInterface.g:190:4: ( (lv_RosServiceServer_11_0= ruleServiceServer ) )
                    // InternalComponentInterface.g:191:5: (lv_RosServiceServer_11_0= ruleServiceServer )
                    {
                    // InternalComponentInterface.g:191:5: (lv_RosServiceServer_11_0= ruleServiceServer )
                    // InternalComponentInterface.g:192:6: lv_RosServiceServer_11_0= ruleServiceServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosServiceServerServiceServerParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_RosServiceServer_11_0=ruleServiceServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"RosServiceServer",
                    							lv_RosServiceServer_11_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.ServiceServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:210:3: (otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentInterface.g:211:4: otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) )
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getServiceClientKeyword_8_0());
                    			
                    // InternalComponentInterface.g:215:4: ( (lv_RosServiceClient_13_0= ruleServiceClient ) )
                    // InternalComponentInterface.g:216:5: (lv_RosServiceClient_13_0= ruleServiceClient )
                    {
                    // InternalComponentInterface.g:216:5: (lv_RosServiceClient_13_0= ruleServiceClient )
                    // InternalComponentInterface.g:217:6: lv_RosServiceClient_13_0= ruleServiceClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosServiceClientServiceClientParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_RosServiceClient_13_0=ruleServiceClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"RosServiceClient",
                    							lv_RosServiceClient_13_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.ServiceClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentInterface"


    // $ANTLR start "entryRuleNamespace"
    // InternalComponentInterface.g:243:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalComponentInterface.g:243:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalComponentInterface.g:244:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalComponentInterface.g:250:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:256:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalComponentInterface.g:257:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalComponentInterface.g:257:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalComponentInterface.g:258:3: this_GlobalNamespace_0= ruleGlobalNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalNamespace_0=ruleGlobalNamespace();

                    state._fsp--;


                    			current = this_GlobalNamespace_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:267:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeNamespace_Impl_1=ruleRelativeNamespace_Impl();

                    state._fsp--;


                    			current = this_RelativeNamespace_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentInterface.g:276:3: this_PrivateNamespace_2= rulePrivateNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrivateNamespace_2=rulePrivateNamespace();

                    state._fsp--;


                    			current = this_PrivateNamespace_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleGraphName"
    // InternalComponentInterface.g:288:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalComponentInterface.g:288:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalComponentInterface.g:289:2: iv_ruleGraphName= ruleGraphName EOF
            {
             newCompositeNode(grammarAccess.getGraphNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphName=ruleGraphName();

            state._fsp--;

             current =iv_ruleGraphName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphName"


    // $ANTLR start "ruleGraphName"
    // InternalComponentInterface.g:295:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | kw= 'GraphName' ) ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:301:2: ( (this_STRING_0= RULE_STRING | kw= 'GraphName' ) )
            // InternalComponentInterface.g:302:2: (this_STRING_0= RULE_STRING | kw= 'GraphName' )
            {
            // InternalComponentInterface.g:302:2: (this_STRING_0= RULE_STRING | kw= 'GraphName' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentInterface.g:303:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getGraphNameAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:311:3: kw= 'GraphName'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getGraphNameAccess().getGraphNameKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphName"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalComponentInterface.g:320:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalComponentInterface.g:320:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalComponentInterface.g:321:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
            {
             newCompositeNode(grammarAccess.getGlobalNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalNamespace=ruleGlobalNamespace();

            state._fsp--;

             current =iv_ruleGlobalNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalNamespace"


    // $ANTLR start "ruleGlobalNamespace"
    // InternalComponentInterface.g:327:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_parts_4_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:333:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalComponentInterface.g:334:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalComponentInterface.g:334:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalComponentInterface.g:335:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalComponentInterface.g:335:3: ()
            // InternalComponentInterface.g:336:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:350:3: (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentInterface.g:351:4: otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    // InternalComponentInterface.g:355:4: ( (lv_parts_4_0= ruleEString ) )
                    // InternalComponentInterface.g:356:5: (lv_parts_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:356:5: (lv_parts_4_0= ruleEString )
                    // InternalComponentInterface.g:357:6: lv_parts_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_parts_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_4_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalNamespace"


    // $ANTLR start "entryRuleRelativeNamespace_Impl"
    // InternalComponentInterface.g:383:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalComponentInterface.g:383:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalComponentInterface.g:384:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
            {
             newCompositeNode(grammarAccess.getRelativeNamespace_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeNamespace_Impl=ruleRelativeNamespace_Impl();

            state._fsp--;

             current =iv_ruleRelativeNamespace_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelativeNamespace_Impl"


    // $ANTLR start "ruleRelativeNamespace_Impl"
    // InternalComponentInterface.g:390:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_parts_4_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:396:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalComponentInterface.g:397:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalComponentInterface.g:397:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalComponentInterface.g:398:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalComponentInterface.g:398:3: ()
            // InternalComponentInterface.g:399:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:413:3: (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentInterface.g:414:4: otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    // InternalComponentInterface.g:418:4: ( (lv_parts_4_0= ruleEString ) )
                    // InternalComponentInterface.g:419:5: (lv_parts_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:419:5: (lv_parts_4_0= ruleEString )
                    // InternalComponentInterface.g:420:6: lv_parts_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_parts_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_4_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelativeNamespace_Impl"


    // $ANTLR start "entryRulePrivateNamespace"
    // InternalComponentInterface.g:446:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalComponentInterface.g:446:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalComponentInterface.g:447:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
            {
             newCompositeNode(grammarAccess.getPrivateNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrivateNamespace=rulePrivateNamespace();

            state._fsp--;

             current =iv_rulePrivateNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrivateNamespace"


    // $ANTLR start "rulePrivateNamespace"
    // InternalComponentInterface.g:453:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject rulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_parts_4_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:459:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalComponentInterface.g:460:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalComponentInterface.g:460:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalComponentInterface.g:461:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalComponentInterface.g:461:3: ()
            // InternalComponentInterface.g:462:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:476:3: (otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentInterface.g:477:4: otherlv_3= 'parts' ( (lv_parts_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    // InternalComponentInterface.g:481:4: ( (lv_parts_4_0= ruleEString ) )
                    // InternalComponentInterface.g:482:5: (lv_parts_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:482:5: (lv_parts_4_0= ruleEString )
                    // InternalComponentInterface.g:483:6: lv_parts_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_parts_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_4_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrivateNamespace"


    // $ANTLR start "entryRuleEString"
    // InternalComponentInterface.g:509:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentInterface.g:509:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentInterface.g:510:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalComponentInterface.g:516:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:522:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComponentInterface.g:523:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComponentInterface.g:523:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentInterface.g:524:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:532:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePublisher"
    // InternalComponentInterface.g:543:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalComponentInterface.g:543:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalComponentInterface.g:544:2: iv_rulePublisher= rulePublisher EOF
            {
             newCompositeNode(grammarAccess.getPublisherRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePublisher=rulePublisher();

            state._fsp--;

             current =iv_rulePublisher; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePublisher"


    // $ANTLR start "rulePublisher"
    // InternalComponentInterface.g:550:1: rulePublisher returns [EObject current=null] : ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject rulePublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_TopicName_4_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:556:2: ( ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:557:2: ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:557:2: ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // InternalComponentInterface.g:558:3: () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:558:3: ()
            // InternalComponentInterface.g:559:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublisherAccess().getPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPublisherAccess().getPublisherKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:573:3: (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentInterface.g:574:4: otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPublisherAccess().getTopicNameKeyword_3_0());
                    			
                    // InternalComponentInterface.g:578:4: ( (lv_TopicName_4_0= ruleEString ) )
                    // InternalComponentInterface.g:579:5: (lv_TopicName_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:579:5: (lv_TopicName_4_0= ruleEString )
                    // InternalComponentInterface.g:580:6: lv_TopicName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getTopicNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_TopicName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPublisherRule());
                    						}
                    						set(
                    							current,
                    							"TopicName",
                    							lv_TopicName_4_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:598:3: (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:599:4: otherlv_5= 'TopicRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPublisherAccess().getTopicRefKeyword_4_0());
                    			
                    // InternalComponentInterface.g:603:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:604:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:604:5: ( ruleEString )
                    // InternalComponentInterface.g:605:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPublisherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPublisherAccess().getTopicRefPublisherCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:620:3: (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:621:4: otherlv_7= 'NameSpace' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getPublisherAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalComponentInterface.g:625:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:626:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:626:5: ( ruleEString )
                    // InternalComponentInterface.g:627:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPublisherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPublisherAccess().getNameSpaceNamespaceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPublisherAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePublisher"


    // $ANTLR start "entryRuleSubscriber"
    // InternalComponentInterface.g:650:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalComponentInterface.g:650:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalComponentInterface.g:651:2: iv_ruleSubscriber= ruleSubscriber EOF
            {
             newCompositeNode(grammarAccess.getSubscriberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubscriber=ruleSubscriber();

            state._fsp--;

             current =iv_ruleSubscriber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubscriber"


    // $ANTLR start "ruleSubscriber"
    // InternalComponentInterface.g:657:1: ruleSubscriber returns [EObject current=null] : ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_TopicName_4_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:663:2: ( ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:664:2: ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:664:2: ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // InternalComponentInterface.g:665:3: () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:665:3: ()
            // InternalComponentInterface.g:666:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubscriberAccess().getSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSubscriberAccess().getSubscriberKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:680:3: (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:681:4: otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubscriberAccess().getTopicNameKeyword_3_0());
                    			
                    // InternalComponentInterface.g:685:4: ( (lv_TopicName_4_0= ruleEString ) )
                    // InternalComponentInterface.g:686:5: (lv_TopicName_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:686:5: (lv_TopicName_4_0= ruleEString )
                    // InternalComponentInterface.g:687:6: lv_TopicName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getTopicNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_TopicName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"TopicName",
                    							lv_TopicName_4_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:705:3: (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:706:4: otherlv_5= 'TopicRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubscriberAccess().getTopicRefKeyword_4_0());
                    			
                    // InternalComponentInterface.g:710:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:711:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:711:5: ( ruleEString )
                    // InternalComponentInterface.g:712:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubscriberRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getTopicRefSubscriberCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:727:3: (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:728:4: otherlv_7= 'NameSpace' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getSubscriberAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalComponentInterface.g:732:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:733:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:733:5: ( ruleEString )
                    // InternalComponentInterface.g:734:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubscriberRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getNameSpaceNamespaceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSubscriberAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubscriber"


    // $ANTLR start "entryRuleMessageDefinition"
    // InternalComponentInterface.g:757:1: entryRuleMessageDefinition returns [EObject current=null] : iv_ruleMessageDefinition= ruleMessageDefinition EOF ;
    public final EObject entryRuleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDefinition = null;


        try {
            // InternalComponentInterface.g:757:58: (iv_ruleMessageDefinition= ruleMessageDefinition EOF )
            // InternalComponentInterface.g:758:2: iv_ruleMessageDefinition= ruleMessageDefinition EOF
            {
             newCompositeNode(grammarAccess.getMessageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageDefinition=ruleMessageDefinition();

            state._fsp--;

             current =iv_ruleMessageDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageDefinition"


    // $ANTLR start "ruleMessageDefinition"
    // InternalComponentInterface.g:764:1: ruleMessageDefinition returns [EObject current=null] : ( () otherlv_1= 'MessageDefinition' ) ;
    public final EObject ruleMessageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:770:2: ( ( () otherlv_1= 'MessageDefinition' ) )
            // InternalComponentInterface.g:771:2: ( () otherlv_1= 'MessageDefinition' )
            {
            // InternalComponentInterface.g:771:2: ( () otherlv_1= 'MessageDefinition' )
            // InternalComponentInterface.g:772:3: () otherlv_1= 'MessageDefinition'
            {
            // InternalComponentInterface.g:772:3: ()
            // InternalComponentInterface.g:773:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageDefinitionAccess().getMessageDefinitionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageDefinition"


    // $ANTLR start "entryRuleServiceServer"
    // InternalComponentInterface.g:787:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalComponentInterface.g:787:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalComponentInterface.g:788:2: iv_ruleServiceServer= ruleServiceServer EOF
            {
             newCompositeNode(grammarAccess.getServiceServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceServer=ruleServiceServer();

            state._fsp--;

             current =iv_ruleServiceServer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceServer"


    // $ANTLR start "ruleServiceServer"
    // InternalComponentInterface.g:794:1: ruleServiceServer returns [EObject current=null] : ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleServiceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_ServiceName_4_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:800:2: ( ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:801:2: ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:801:2: ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // InternalComponentInterface.g:802:3: () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:802:3: ()
            // InternalComponentInterface.g:803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceServerAccess().getServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceServerAccess().getServiceServerKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:817:3: (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:818:4: otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getServiceServerAccess().getServiceNameKeyword_3_0());
                    			
                    // InternalComponentInterface.g:822:4: ( (lv_ServiceName_4_0= ruleEString ) )
                    // InternalComponentInterface.g:823:5: (lv_ServiceName_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:823:5: (lv_ServiceName_4_0= ruleEString )
                    // InternalComponentInterface.g:824:6: lv_ServiceName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getServiceNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_ServiceName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"ServiceName",
                    							lv_ServiceName_4_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:842:3: (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:843:4: otherlv_5= 'SrvRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceServerAccess().getSrvRefKeyword_4_0());
                    			
                    // InternalComponentInterface.g:847:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:848:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:848:5: ( ruleEString )
                    // InternalComponentInterface.g:849:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceServerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getSrvRefServiceServerCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:864:3: (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:865:4: otherlv_7= 'NameSpace' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceServerAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalComponentInterface.g:869:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:870:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:870:5: ( ruleEString )
                    // InternalComponentInterface.g:871:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceServerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getNameSpaceNamespaceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceServerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceServer"


    // $ANTLR start "entryRuleServiceClient"
    // InternalComponentInterface.g:894:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalComponentInterface.g:894:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalComponentInterface.g:895:2: iv_ruleServiceClient= ruleServiceClient EOF
            {
             newCompositeNode(grammarAccess.getServiceClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceClient=ruleServiceClient();

            state._fsp--;

             current =iv_ruleServiceClient; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceClient"


    // $ANTLR start "ruleServiceClient"
    // InternalComponentInterface.g:901:1: ruleServiceClient returns [EObject current=null] : ( () otherlv_1= 'ServiceClient' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleServiceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_ServiceName_4_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:907:2: ( ( () otherlv_1= 'ServiceClient' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:908:2: ( () otherlv_1= 'ServiceClient' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:908:2: ( () otherlv_1= 'ServiceClient' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // InternalComponentInterface.g:909:3: () otherlv_1= 'ServiceClient' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:909:3: ()
            // InternalComponentInterface.g:910:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceClientAccess().getServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceClientAccess().getServiceClientKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:924:3: (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:925:4: otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getServiceClientAccess().getServiceNameKeyword_3_0());
                    			
                    // InternalComponentInterface.g:929:4: ( (lv_ServiceName_4_0= ruleEString ) )
                    // InternalComponentInterface.g:930:5: (lv_ServiceName_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:930:5: (lv_ServiceName_4_0= ruleEString )
                    // InternalComponentInterface.g:931:6: lv_ServiceName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getServiceNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_ServiceName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"ServiceName",
                    							lv_ServiceName_4_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:949:3: (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:950:4: otherlv_5= 'SrvRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceClientAccess().getSrvRefKeyword_4_0());
                    			
                    // InternalComponentInterface.g:954:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:955:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:955:5: ( ruleEString )
                    // InternalComponentInterface.g:956:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceClientRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getSrvRefServiceClientCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:971:3: (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:972:4: otherlv_7= 'NameSpace' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceClientAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalComponentInterface.g:976:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:977:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:977:5: ( ruleEString )
                    // InternalComponentInterface.g:978:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceClientRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getNameSpaceNamespaceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceClient"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001C080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000310080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000210080000L});

}